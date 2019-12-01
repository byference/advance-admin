package io.github.byference.admin.modules.system.controller;

import io.github.byference.admin.modules.system.service.SysUserService;
import io.github.byference.admin.util.Result;
import io.github.byference.admin.modules.system.vo.ModifySysUserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SysUserController
 *
 * @author byference
 * @since 2019-11-04
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("sysUser")
public class SysUserController {

    private final SysUserService sysUserService;


    @PostMapping("modify")
    public Result<String> modifySysUser(@Validated ModifySysUserVO modifySysUserVO) {
        sysUserService.modifySysUser(modifySysUserVO);
        return Result.ok();
    }

}
