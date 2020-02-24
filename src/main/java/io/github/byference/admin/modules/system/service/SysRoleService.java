package io.github.byference.admin.modules.system.service;

import io.github.byference.admin.modules.system.entity.SysRole;
import io.github.byference.admin.modules.system.mapper.SysRoleMapper;
import io.github.byference.admin.modules.system.vo.SysRoleVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * SysRoleService
 *
 * @author byference
 * @since 2020-02-24
 */
@Service
@RequiredArgsConstructor
public class SysRoleService {

    private final SysRoleMapper sysRoleMapper;

    public SysRoleVO getRoleById(Integer roleId) {
        SysRole sysRole = sysRoleMapper.selectByPrimaryKey(roleId);
        SysRoleVO sysRoleVO = new SysRoleVO();
        BeanUtils.copyProperties(sysRole, sysRoleVO);
        return sysRoleVO;
    }

}
