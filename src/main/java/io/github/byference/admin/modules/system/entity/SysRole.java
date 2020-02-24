package io.github.byference.admin.modules.system.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * SysRole
 *
 * @author byference
 * @since 2020-02-23
 */
@Data
public class SysRole implements Serializable {

    private static final long serialVersionUID = -9190318785515447863L;

    /**
     * 主键ID
     */
    @Id
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
     * 创建人
     */
    private Integer creatorId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Integer modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

}
