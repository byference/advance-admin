package io.github.byference.admin.modules.system.controller;

import io.github.byference.admin.modules.system.entity.SysPermission;
import io.github.byference.admin.modules.system.service.SysPermissionService;
import io.github.byference.admin.modules.system.service.SysRoleService;
import io.github.byference.admin.modules.system.service.SysUserService;
import io.github.byference.admin.modules.system.vo.ModifySysUserVO;
import io.github.byference.admin.modules.system.vo.SysRoleVO;
import io.github.byference.admin.modules.system.vo.SysUserVO;
import io.github.byference.admin.util.PrincipalUtil;
import io.github.byference.admin.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * SysUserController
 *
 * @author byference
 * @since 2019-11-04
 */
@Api(value = "系统用户模块", tags = "系统用户模块")
@RequiredArgsConstructor
@RestController
@RequestMapping("sysUser")
public class SysUserController {

    private final SysUserService sysUserService;
    private final SysRoleService sysRoleService;
    private final SysPermissionService sysPermissionService;


    @GetMapping("info")
    @ApiOperation("获取系统用户信息")
    public Result<SysUserVO> info() {

        Integer currentUserId = PrincipalUtil.getCurrentUserId();
        SysUserVO sysUser = sysUserService.getByUserId(currentUserId);
        SysRoleVO role = sysRoleService.getRoleById(sysUser.getRoleId());
        List<SysPermission> permissions = sysPermissionService.getPermissionByRoleId(sysUser.getRoleId());
        sysUser.setRole(role);
        role.setPermissions(permissions);
        return Result.ok(sysUser);
    }


    @PostMapping("modify")
    @ApiOperation("修改系统用户信息")
    public Result<String> modifySysUser(@Validated ModifySysUserVO modifySysUserVO) {
        sysUserService.modifySysUser(modifySysUserVO);
        return Result.ok();
    }

}
