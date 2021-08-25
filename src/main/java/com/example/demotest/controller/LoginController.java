package com.example.demotest.controller;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.fastjson.JSON;
import com.example.demotest.entity.User;
import com.example.demotest.util.JwtUtil;
import com.example.demotest.util.RedisUtil;
import com.example.demotest.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Log4j2
@RestController
@Api(value = "JWT", tags = "JWTAPI")
@RequestMapping("token")
public class LoginController {
    @Autowired
    RedisUtil redisUtil;

    @PostMapping("/login")
    @ApiOperation("登录")
    public ResponseEntity login(@RequestBody User user) {
        String token = JwtUtil.createToken(user);
        redisUtil.set(user.getName(), token);
        return ResultUtil.success(token);
    }
}
