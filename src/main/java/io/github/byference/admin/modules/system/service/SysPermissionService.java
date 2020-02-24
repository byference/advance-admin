package io.github.byference.admin.modules.system.service;

import io.github.byference.admin.modules.system.entity.SysPermission;
import io.github.byference.admin.modules.system.entity.SysRolePermission;
import io.github.byference.admin.modules.system.mapper.SysPermissionMapper;
import io.github.byference.admin.modules.system.mapper.SysRolePermissionMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SysPermissionService
 *
 * @author byference
 * @since 2020-02-24
 */
@Service
@RequiredArgsConstructor
public class SysPermissionService {

    private final SysPermissionMapper sysPermissionMapper;
    private final SysRolePermissionMapper sysRolePermissionMapper;


    public List<SysPermission> getPermissionByRoleId(Integer roleId) {
        Example roleExample = new Example(SysRolePermission.class);
        roleExample.createCriteria().andEqualTo("roleId", roleId);
        List<SysRolePermission> sysRolePermissions = sysRolePermissionMapper.selectByExample(roleExample);
        if (CollectionUtils.isNotEmpty(sysRolePermissions)) {
            List<Integer> permissionIds = sysRolePermissions.stream().map(SysRolePermission::getPermissionId).collect(Collectors.toList());
            Example permissionExample = new Example(SysPermission.class);
            permissionExample.createCriteria().andIn("id", permissionIds);
            return sysPermissionMapper.selectByExample(permissionExample);
        }
        return Collections.emptyList();
    }

}
