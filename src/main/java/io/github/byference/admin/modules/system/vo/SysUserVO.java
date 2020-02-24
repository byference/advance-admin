package io.github.byference.admin.modules.system.vo;

import io.github.byference.admin.modules.system.entity.SysUser;
import lombok.Data;

import java.io.Serializable;

/**
 * SysUserVO
 *
 * @see SysUser
 * @author byference
 * @since 2019-11-04
 */
@Data
public class SysUserVO implements Serializable {

    private static final long serialVersionUID = -7888983370662950830L;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 简介
     */
    private String userProfile;

    /**
     * 手机号
     */
    private String telephone;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 角色
     */
    private SysRoleVO role;

}
