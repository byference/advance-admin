package io.github.byference.admin.security;

import io.github.byference.admin.constant.SecurityConst;
import io.github.byference.admin.modules.system.entity.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Objects;

/**
 * AdvanceUserDetails
 *
 * @author byference
 * @since 2019-11-04
 */
public class AdvanceUserDetails extends User {

    private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

    private final SysUser sysUser;

    public AdvanceUserDetails(SysUser sysUser, Collection<? extends GrantedAuthority> authorities) {
        this(sysUser, true, true, true, !Objects.equals(sysUser.getUserState(), SecurityConst.ACCOUNT_LOCKED), authorities);
    }

    public AdvanceUserDetails(SysUser sysUser, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(sysUser.getUserName(), sysUser.getPassword(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.sysUser = sysUser;
        this.sysUser.setPassword(null);
    }

    public Integer getId() {
        return sysUser.getId();
    }
}
