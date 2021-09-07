package com.example.demotest.config;


import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;


/**
 * @ClassName: WebLogAspect
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/2 17:32
 */
@Aspect
@Component
@Log4j2
public class WebLogAspectConfig {

    //private Logger logger = Logger.getLogger(getClass());

    @Pointcut("execution(* com.example.demotest.controller..*.*(..))")
    public void webLog(){
    }
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        //RequestContextHolder   获取容器值
        //RequestContextHolder.resetRequestAttributes();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        //包路径
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() +
                "." + joinPoint.getSignature().getName());
        //请求值
        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
// 处理完请求，返回内容
        log.info("RESPONSE : " + ret);
    }



    }


