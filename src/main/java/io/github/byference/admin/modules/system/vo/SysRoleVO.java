package io.github.byference.admin.modules.system.vo;

import io.github.byference.admin.modules.system.entity.SysPermission;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * SysRoleVO
 *
 * @author byference
 * @since 2020-02-24
 */
@Data
public class SysRoleVO implements Serializable {

    private static final long serialVersionUID = -2771241791278848520L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String RoleDescribe;

    /**
     * 角色状态
     */
    private Integer roleStatus;

    /**
     * 权限集合
     */
    List<SysPermission> permissions;

}
