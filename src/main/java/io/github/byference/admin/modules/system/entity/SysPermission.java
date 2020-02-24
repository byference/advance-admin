package io.github.byference.admin.modules.system.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * SysPermission
 *
 * @author byference
 * @since 2020-02-23
 */
@Data
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1733220247518044576L;

    /**
     * 主键ID
     */
    @Id
    private Integer id;

    /**
     * 权限名称 permissionName
     */
    private String permissionName;

    /**
     * 权限行为描述
     */
    private String permissionDescribe;

}
