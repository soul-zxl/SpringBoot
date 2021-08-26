package com.example.demotest.controller;

import com.example.demotest.entity.User;
import com.example.demotest.util.JwtUtil;
import com.example.demotest.util.MessageUtils;
import com.example.demotest.util.RedisUtil;
import com.example.demotest.util.ResultUtil;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import cn.hutool.core.lang.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

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

    @PostMapping("login")
    @ApiOperation("登录")
    public ResponseEntity login(@RequestBody User user) {
        //todo 用户查询
        int count =1;
        Assert.isTrue(count>0, "reg.account.error");
        String token = JwtUtil.createToken(user);
        HashMap<String, Object> map = Maps.newHashMap();
        map.put("token",token);
        user.setPass(null);
        map.put("user",user);
        redisUtil.set(user.getName(), token);
        return ResultUtil.success(map);
    }
}
