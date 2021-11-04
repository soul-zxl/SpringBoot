package com.example.demotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//关闭安全框架的配置，不起作用
//@SpringBootApplication(exclude ={SecurityAutoConfiguration.class})
@SpringBootApplication
public class DemoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTestApplication.class, args);
    }

}
