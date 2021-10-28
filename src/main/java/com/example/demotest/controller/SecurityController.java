package com.example.demotest.controller;

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
}
