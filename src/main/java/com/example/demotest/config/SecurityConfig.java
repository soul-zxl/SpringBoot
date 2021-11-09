package com.example.demotest.config;


import com.example.demotest.service.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.annotation.Resource;

//@EnableGlobalMethodSecurity
// 启用方法级别的认证  默认为fales
//ture  启用 @preAuthorize  和 @postAuthorize
@EnableGlobalMethodSecurity(prePostEnabled = true)
//启动Security功能
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("MyUserDetailsService")
    MyUserDetails myUserDetailsService;


    /**
     * 链式开发     安全策略
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        MyUserDetails myUserDetails;

        /**
         * 第一种   简单的认证登录
         */
        //应用场景     例如首页
        //请求认证 authorizeRequests()
        //http.authorizeRequests()
        //        //   请求路径                  所有人都能访问
        //        .antMatchers("/").permitAll()
        //        .antMatchers("/index1/**").hasAnyRole("user1")
        //        .antMatchers("/index2/**").hasAnyRole("user2")
        //        .antMatchers("/index3/**").hasAnyRole("user3")
        //    没有权限跳转的登录页面
        //   .and()
        //            .formLogin()
        //            //    注销   开启注销
        //            .and().csrf().disable();//关闭csrf()功能


        /**
         * 第一种   实现自动登录的两种方法   数据库方法
         */

        //http
        //        .authorizeRequests()
        //        .anyRequest()
        //        //认证
        //        .authenticated()
        //
        //        .and()
        //        //设置跳转到登录页面
        //        .formLogin().loginPage("/login")
        //        //成功跳转到首页
        //        .successForwardUrl("/").permitAll()
        //        .and()
        //        //退出登录
        //        .logout().permitAll()
        //        .and()
        //        //记住我
        //        .rememberMe()
        //        //设置获取token
        //        .tokenRepository(persistentTokenRepository())
        //        .tokenValiditySeconds(60)
        //        //校验
        //        .userDetailsService(MyUserDetails);
        //
        //// 关闭CSRF跨域
        //http.csrf().disable();



        /**
         * 第二种   实现自动登录的两种方法   存在cookie里
         */

         http.authorizeRequests().anyRequest().authenticated()
                 .and()
                 .formLogin().loginPage("login")
                 .successForwardUrl("/").permitAll()
                 .failureForwardUrl("error")

                 .and().logout().permitAll()
                 .and()
                 .rememberMe();


              http.csrf().disable();


    }

    //设置token
    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        //tokenRepository.setDataSource("dataSource");
        // 如果token表不存在，使用下面语句可以初始化该表；若存在，请注释掉这条语句，否则会报错。
//        tokenRepository.setCreateTableOnStartup(true);
        return tokenRepository;
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //最后还需要解密
        auth.userDetailsService(myUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());


    }
}
