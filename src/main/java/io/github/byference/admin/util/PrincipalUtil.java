package io.github.byference.admin.util;

import io.github.byference.admin.security.AdvanceUserDetails;
import io.github.byference.admin.constant.SecurityConst;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Objects;

/**
 * PrincipalUtil
 *
 * @author byference
 * @since 2019-11-04
 */
public class PrincipalUtil {


    private PrincipalUtil() {}

    /**
     * get login user ID
     */
    public static String getCurrentUserName() {
        return isLogin() ? ((AdvanceUserDetails) getPrincipal()).getUsername() : null;
    }

    /**
     * get login user ID
     */
    public static Integer getCurrentUserId() {

        return isLogin() ? ((AdvanceUserDetails) getPrincipal()).getId() : null;
    }

    /**
     * check whether the current user has logged in
     *
     * @return true if had logged in
     */
    public static boolean isLogin() {

        return !Objects.equals(getPrincipal(), SecurityConst.ANONYMOUS_USER);
    }

    /**
     * The identity of the principal being authenticated. In the case of an authentication
     * request with username and password, this would be the username. Callers are
     * expected to populate the principal for an authentication request.
     * <p>
     * The <tt>AuthenticationManager</tt> implementation will often return an
     * <tt>Authentication</tt> containing richer information as the principal for use by
     * the application. Many of the authentication providers will create a
     * {@code UserDetails} object as the principal.
     *
     * @return the <code>Principal</code> being authenticated or the authenticated
     * principal after authentication.
     */
    public static Object getPrincipal() {
        return getAuthentication().getPrincipal();
    }

    /**
     * Obtains the currently authenticated principal, or an authentication request token.
     *
     * @return the <code>Authentication</code> or <code>null</code> if no authentication
     * information is available
     */
    public static Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

}
