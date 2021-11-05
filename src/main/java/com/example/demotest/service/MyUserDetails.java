package com.example.demotest.service;

import com.example.demotest.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MyUserDetails
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 14:47
 */
@Service(value = "MyUserDetailsService")
//实现UserDetailsService接口 并重写中的UserDetails方法
public class MyUserDetails implements UserDetailsService {
    @Autowired
    UserService userService;


    //UserDetails方法放回的UserDetails类型对象   构建UserDetails类
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        User userDetails=null;
        if (userName != null) {
            UserInfo user = userService.getUser(userName);
            //创建角色对象
            ArrayList<GrantedAuthority> list = new ArrayList();
            //角色名必须以ROLE_开头
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_" + user.getRole());
            list.add(grantedAuthority);
            //创建user  是UserDetails的实现类
          userDetails = new User(user.getUserName(), user.getPassWord(),list);
        }
        return userDetails;
    }
}
