package com.example.demotest.controller;

import com.example.demotest.entity.UserInfo;
import com.example.demotest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: SecurityController
 * @Description:
 * @Author: Administrator
 * @Date: 2021/10/28 15:02
 */

@RestController
@RequestMapping("Security")
public class SecurityController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String Security() {
        return "hello Security";
    }

    @RequestMapping("/allUser")
    @PreAuthorize(value = "hasAnyRole('admin','user')")
    public String allUser() {
        return "这是所有人都能登录";
    }

    @RequestMapping("/admin")
    @PreAuthorize(value = "hasAnyRole('admin')")
    public String admin() {
        return "这是管理员才能登录";
    }


    @GetMapping("/user")
    public String user() {
        ////userService.getUser().stream().forEach(e->{
        ////    System.out.println(e);
        ////});
        //PasswordEncoder bc = new BCryptPasswordEncoder();
        //UserInfo user = new UserInfo();
        //user.setUserName("zxl");
        //user.setPassWord(bc.encode("123456"));
        //user.setRole("admin");
        //userService.save(user);

        return "你好，感谢使用";
    }


}
