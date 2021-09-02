package com.example.demotest.config;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;
import com.example.demotest.util.JwtUtil;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: InterfaceChecking
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/2 18:19
 */


@Log4j2
@Aspect
public class InterfaceChecking {



    @Pointcut("execution(* com.example.demotest.controller..*.*(..))")
    public void TokenChecking(){

    }

    @Before("TokenChecking()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        //获取请求token
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String token = attributes.getRequest().getHeader("Authorization");
        // 分离token
        String[] strs = token.split(" ");
        token = strs[1];

        //校验token是否完整
        boolean verify = JwtUtil.verify(token);
        Assert.isTrue(verify);

        //校验token是否过期

        //解析token,并获取key,查看是否存在redis中
        String name = JwtUtil.verifyToken(token);

       //存入redis中放行





    }
}
