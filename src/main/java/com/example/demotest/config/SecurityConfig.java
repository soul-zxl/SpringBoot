package com.example.demotest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
//启动Security功能
@EnableWebSecurity
//@EnableGlobalMethodSecurity
// 启用方法级别的认证  默认为fales
//ture  启用 @preAuthorize  和 @postAuthorize
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    PasswordEncoder pe =passwordEncoder();

    //实现用户密码的信息
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //在内存中实现登录
        auth.inMemoryAuthentication().withUser("zxl").password(pe.encode("123456")).roles("normal");
        auth.inMemoryAuthentication().withUser("zxy").password(pe.encode("123456")).roles("normal");
        auth.inMemoryAuthentication().withUser("admin").password(pe.encode("admin")).roles("admin","normal");
        super.configure(auth);
    }
    //不能明文，需要加密  创建密码加密类
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
