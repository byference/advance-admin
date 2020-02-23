package io.github.byference.admin.modules.system.service;

import io.github.byference.admin.modules.system.entity.SysUser;
import io.github.byference.admin.modules.system.mapper.SysUserMapper;
import io.github.byference.admin.modules.system.vo.ModifySysUserVO;
import io.github.byference.admin.modules.system.vo.SysUserVO;
import io.github.byference.admin.util.PrincipalUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * SysUserService
 *
 * @author byference
 * @since 2019-11-03
 */
@Service
@RequiredArgsConstructor
public class SysUserService {

    private final SysUserMapper sysUserMapper;


    /**
     * get userInfo by userId
     * @param userId 用户ID
     * @return {@link SysUser}
     */
    public SysUserVO getByUserId(Integer userId) {
        Assert.notNull(userId, "用户ID不能为空");
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
        // 脱敏
        SysUserVO sysUserVO = new SysUserVO();
        BeanUtils.copyProperties(sysUser, sysUserVO);
        return sysUserVO;
    }

    /**
     * modify SysUser information
     *
     * @param modifySysUserVO {@link ModifySysUserVO}
     * @return true if the modification is successful
     */
    public boolean modifySysUser(ModifySysUserVO modifySysUserVO) {

        SysUser sysUser = new SysUser();
        BeanUtils.copyProperties(modifySysUserVO, sysUser);
        sysUser.setModificationTime(new Date());
        sysUser.setModifier(PrincipalUtil.getCurrentUserId());
        return sysUserMapper.updateByPrimaryKeySelective(sysUser) > 0;
    }

    /**
     * load user by username
     */
    public SysUser loadUserByUsername(String username) {
        Assert.hasLength(username, "用户名不允许为空");

        Example sysUserExample = new Example(SysUser.class);
        sysUserExample.createCriteria().andEqualTo("userName", username);
        final List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        if (CollectionUtils.isNotEmpty(sysUsers)) {
            return sysUsers.get(0);
        }
        return null;
    }

}
