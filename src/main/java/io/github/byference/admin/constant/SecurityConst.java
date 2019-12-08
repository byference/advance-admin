package io.github.byference.admin.constant;

/**
 * SecurityConst
 *
 * @author byference
 * @since 2019-11-03
 */
public interface SecurityConst {

    /**
     * public client id
     */
    String PUBLIC_CLIENT_ID = "PUBLIC_CLIENT_ID";

    /**
     * public secret
     */
    String PUBLIC_SECRET = "PUBLIC_SECRET";

    /**
     * default access token validity seconds
     */
    int ACCESS_TOKEN_VALIDITY_SECONDS = 3600 * 2;

    /**
     * default refresh token validity seconds
     */
    int REFRESH_TOKEN_VALIDITY_SECONDS = 3600 * 8;

    /**
     * anonymous user
     */
    String ANONYMOUS_USER = "anonymousUser";

    /**
     * account status
     */
    int ACCOUNT_LOCKED = 2;
}
