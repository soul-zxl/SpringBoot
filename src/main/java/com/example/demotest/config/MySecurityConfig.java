package com.example.demotest.config;

import com.example.demotest.service.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ClassName: MySecurityConfig
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 16:37
 */
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    MyUserDetails myUserDetails=null;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    //myUserDetails.
        //super.configure(http);
    }
}
