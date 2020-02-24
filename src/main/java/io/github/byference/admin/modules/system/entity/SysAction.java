package io.github.byference.admin.modules.system.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * SysAction
 *
 * @author byference
 * @since 2020-02-23
 */
@Data
public class SysAction implements Serializable {

    private static final long serialVersionUID = 2088323034825592450L;

    /**
     * 主键ID
     */
    @Id
    private Integer id;

    /**
     * 权限行为
     */
    private String action;

    /**
     * 权限行为: 0 false，1 true
     */
    private Integer defaultCheck;

    /**
     * 权限行为描述
     */
    private String permissionDescribe;

}
