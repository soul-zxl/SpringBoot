package com.example.demotest.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demotest.entity.UserInfo;
import com.example.demotest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 14:17
 */

@Service
public class UserService extends ServiceImpl<UserMapper, UserInfo> {


    public UserInfo getUser(String name){
        LambdaQueryWrapper<UserInfo> where = Wrappers.lambdaQuery();
         where.eq(UserInfo::getUserName,name);
         UserInfo list = this.getOne(where);
        return list;
    }
}
