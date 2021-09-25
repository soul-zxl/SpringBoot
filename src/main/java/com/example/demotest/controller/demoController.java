package com.example.demotest.controller;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.example.demotest.config.JwtTokenInterceptorConfig;
import com.example.demotest.entity.User;
import com.example.demotest.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;



@Log4j2
@RestController
@Api(value = "demo", tags = "demoAPI")
@RequestMapping("/demo")
public class demoController {
    @Autowired
    JwtTokenInterceptorConfig jwtTokenInterceptorConfig;

    @PostMapping("/add")
    @ApiOperation("测试接口验证")
    public ResponseEntity updateUser( HttpServletRequest request) throws Exception {
        String tokenHeader = request.getHeader("Authorization");
        if (StrUtil.isNotEmpty(tokenHeader)) {
            //需要转换成String类型
            String token = JSON.toJSONString(tokenHeader);
            Boolean tokenBoolean = jwtTokenInterceptorConfig.verifyToken(token);
            if (tokenBoolean==true) {
                return ResultUtil.success("验证成功");
            } else {
                return ResultUtil.success("验证失败");
            }
        } else {
            return ResultUtil.error("token为空");
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
