package io.github.byference.admin.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * AdvanceAdminProperties
 *
 * @author byference
 * @since 2020-03-07
 */
@Data
@EnableConfigurationProperties(AdvanceAdminProperties.class)
@ConfigurationProperties(prefix = "advance")
public class AdvanceAdminProperties {


    @NestedConfigurationProperty
    private final AdvanceSecurityProperties security = new AdvanceSecurityProperties();

    @NestedConfigurationProperty
    private final MinioProperties minio = new MinioProperties();

}
