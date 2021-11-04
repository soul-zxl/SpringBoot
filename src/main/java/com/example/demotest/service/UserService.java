package com.example.demotest.service;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demotest.entity.User;
import com.example.demotest.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 10:11
 */

@Service
public class UserService extends ServiceImpl<UserMapper, User> {


    public User userInfo(String name){
        LambdaQueryChainWrapper<User> where = lambdaQuery();
        where.eq(User::getUserName,name);
        return  this.getOne(where);
    }

    @Test
    public void test(){
       PasswordEncoder pe = new BCryptPasswordEncoder();

        User user = new User();
        user.setId(1);
        user.setUserName("zxl");
        user.setPassWord(pe.encode("123456"));
        user.setRole("user");
        this.save(user);

        User user1 = new User();
        user1.setUserName("meimei");
        user1.setPassWord(pe.encode("123456"));
        user1.setRole("admin");
        this.save(user1);
    }

}
