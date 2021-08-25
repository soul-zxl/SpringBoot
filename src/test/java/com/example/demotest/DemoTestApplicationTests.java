package com.example.demotest;

import com.example.demotest.entity.User;
import com.example.demotest.util.JwtUtil;
import com.example.demotest.util.RedisUtil;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@Log4j2
@SpringBootTest
class DemoTestApplicationTests {
    @Resource
    RedisUtil redisUtil;
    @Resource
    JwtUtil jwtUtil;
    @Test
    void contextLoads(){
        boolean set = redisUtil.set("1", 1);
        System.out.println(set);
        System.out.println(redisUtil.get("1"));
    }
}
