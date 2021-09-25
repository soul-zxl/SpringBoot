package com.example.demotest.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demotest.dto.LoginLogDTO;
import com.example.demotest.entity.LoginInfo;
import com.example.demotest.mapper.LoginLogMapper;
import com.example.demotest.vo.LoginLogVO;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/*

 */
@Service
public class LoginLogService extends ServiceImpl<LoginLogMapper, LoginInfo> {

    @Resource
    LoginLogMapper loginLogMapper;


    public Page findPage(LoginLogDTO dto) {

        Page<LoginLogVO> page = this.loginLogMapper.findPage(new Page<>(dto.getCurrPage(), dto.getSize()), dto);
        return page;
    }


}
