package io.github.byference.admin.modules.system.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * SysRolePermission
 *
 * @author byference
 * @since 2020-02-24
 */
@Data
public class SysRolePermission implements Serializable {

    private static final long serialVersionUID = 3064221908085508870L;

    /**
     * 主键ID
     */
    @Id
    private Integer id;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 权限ID
     */
    private Integer permissionId;
}
