package com.lxh.permission.commerce.Service.impl;

import com.lxh.permission.commerce.Service.SysUserService;
import com.lxh.permission.common.mybatis.dao.SysUserMapper;
import com.lxh.permission.common.mybatis.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectAll() {
        SysUser sysUsers = sysUserMapper.selectByPrimaryKey(1);

        return sysUsers;
    }
}
