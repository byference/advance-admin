package io.github.byference.admin.modules.system.service;

import com.github.pagehelper.PageHelper;
import io.github.byference.admin.modules.system.entity.Project;
import io.github.byference.admin.modules.system.mapper.SysProjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * SysProjectService
 *
 * @author byference
 * @since 2020-02-24
 */
@Service
@RequiredArgsConstructor
public class ProjectService {

    private final SysProjectMapper sysProjectMapper;


    public List<Project> getProjects(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Example projectExample = new Example(Project.class);
        projectExample.createCriteria().andEqualTo("projectStatus", "1");
        return sysProjectMapper.selectByExample(projectExample);
    }

}
