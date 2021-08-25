package com.example.demotest.controller;

import com.example.demotest.config.JwtTokenInterceptorConfig;
import com.example.demotest.entity.User;
import com.example.demotest.util.JwtUtil;
import com.example.demotest.util.MessageUtils;
import com.example.demotest.util.RedisUtil;
import com.example.demotest.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Log4j2
@RestController
@Api(value = "demo",tags = "demoAPI")
@RequestMapping("/demo")
public class demoController {
      @Autowired
    JwtTokenInterceptorConfig jwtTokenInterceptorConfig;

    @PostMapping("/add")
    @ApiOperation("更新用户的接口")
    public ResponseEntity updateUser(@RequestBody User user, HttpServletRequest request) throws Exception {
        String token = request.getHeader("Authorization");
        Boolean aBoolean = jwtTokenInterceptorConfig.verifyToken(request);
        if (aBoolean==true){
            return ResultUtil.success("验证成功");
        }else {
            return ResultUtil.success("验证失败");

        }

    }


    @PostMapping("/update")
    @ApiOperation("添加用户的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
    }
    )
    public String addUser(@RequestBody User user) {
        return "ok";
    }



}
