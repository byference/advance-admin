package io.github.byference.admin.security;

import io.github.byference.admin.constant.SecurityConst;
import io.github.byference.admin.core.properties.AdvanceAdminProperties;
import io.github.byference.admin.security.handler.DefaultAccessDeniedHandler;
import io.github.byference.admin.security.handler.DefaultAuthenticationEntryPoint;
import io.github.byference.admin.security.handler.DefaultLogoutSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * OAuth2ServerConfig
 *
 * @author byference
 * @since 2019-11-02
 */
@Configuration
public class OAuth2ServerConfig {

    /**
     * ResourceServer
     */
    @Configuration
    @EnableResourceServer
    protected static class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

        private final AdvanceAdminProperties advanceAdminProperties;

        public ResourceServerConfiguration(AdvanceAdminProperties advanceAdminProperties) {
            this.advanceAdminProperties = advanceAdminProperties;
        }

        @Override
        public void configure(ResourceServerSecurityConfigurer resources) {
            resources.authenticationEntryPoint(new DefaultAuthenticationEntryPoint())
                    .accessDeniedHandler(new DefaultAccessDeniedHandler());
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.csrf().disable()
                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                    .and()
                    .authorizeRequests()
                    .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                    .antMatchers(advanceAdminProperties.getSecurity().getPermitUrls()).permitAll()
                    .anyRequest().authenticated()
                    .and().logout().logoutSuccessHandler(new DefaultLogoutSuccessHandler());
        }
    }


    @Configuration
    @EnableAuthorizationServer
    protected static class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

        @Autowired
        private AuthenticationManager authenticationManager;

        @Autowired
        private RedisConnectionFactory redisConnectionFactory;

        @Autowired
        private PasswordEncoder passwordEncoder;

        @Override
        public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
            clients.inMemory()
                    .withClient(SecurityConst.PUBLIC_CLIENT_ID)
                    .secret(passwordEncoder.encode(SecurityConst.PUBLIC_SECRET))
                    .authorizedGrantTypes("password", "refresh_token")
                    .scopes("all")
                    .accessTokenValiditySeconds(SecurityConst.ACCESS_TOKEN_VALIDITY_SECONDS)
                    .refreshTokenValiditySeconds(SecurityConst.REFRESH_TOKEN_VALIDITY_SECONDS);
        }

        @Override
        public void configure(AuthorizationServerSecurityConfigurer security) {
            security.allowFormAuthenticationForClients();
        }

        @Override
        public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
            endpoints.tokenStore(new RedisTokenStore(redisConnectionFactory))
                    .authenticationManager(authenticationManager);
        }
    }

}
