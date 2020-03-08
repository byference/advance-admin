package io.github.byference.admin.modules.system.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * SysProject
 *
 * @author byference
 * @since 2020-02-24
 */
@Data
public class Project implements Serializable {

    private static final long serialVersionUID = -2862160465514276520L;

    /**
     * 主键ID
     */
    @Id
    private Integer id;

    /**
     * 项目封面
     */
    private String cover;

    /**
     * 项目标题
     */
    private String title;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 项目外链
     */
    private String extraUrl;

    /**
     * 项目状态: 0禁用 ,1启用
     */
    private Integer projectStatus;

}
