package io.github.byference.admin.modules.system.controller;

import io.github.byference.admin.modules.system.entity.Project;
import io.github.byference.admin.modules.system.service.ProjectService;
import io.github.byference.admin.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ProjectController
 *
 * @author byference
 * @since 2020-02-24
 */
@Api(value = "项目模块", tags = "项目模块")
@RequiredArgsConstructor
@RestController
@RequestMapping("projects")
public class ProjectController {

    private final ProjectService projectService;


    @GetMapping("list")
    @ApiOperation("获取项目列表")
    public Result<List<Project>> projects() {
        List<Project> projects = projectService.getProjects(1, 10);
        return Result.ok(projects);
    }

}
