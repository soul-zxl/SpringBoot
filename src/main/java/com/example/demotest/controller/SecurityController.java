package com.example.demotest.controller;

import org.springframework.security.access.prepost.PreAuthorize;
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

    @GetMapping("hello")
    public String Security() {
        return "hello Security";
    }

    @RequestMapping("allUser")
    @PreAuthorize(value = "hasAnyRole('admin','user')")
    public String allUser() {
        return "这是所有人都能登录";
    }

    @RequestMapping("admin")
    @PreAuthorize(value = "hasAnyRole('admin')")
    public String admin() {
        return "这是管理员才能登录";
    }
}
