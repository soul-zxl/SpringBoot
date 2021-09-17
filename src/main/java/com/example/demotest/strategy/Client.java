package com.example.demotest.strategy;

import com.example.demotest.entity.Blog;
import com.example.demotest.entity.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.Assert;

import java.util.Optional;

@Log4j2
public class Client {

    public static String User(User user) {


        boolean present = Optional.ofNullable(user)
                .isPresent();


        String name= Optional.ofNullable(user)
                   .map(e->e.getName())
                   .orElse("unKnow");
                 return name;


    }

            public static void main (String[]args){

            User user = new User();
            //user.setName("你好");


                boolean present = Optional.ofNullable(user)
                        .isPresent();
               log.info(present);


                String name= Optional.ofNullable(user)
                        .map(e->e.getName())
                        .orElse("unKnow");
                log.info(name);




                ////创建环境
            //Environment environment = new Environment(new advanced());
            ////实现
            //double quote = environment.quote(1000);
            //System.out.println("图书的价格位："+quote);

            //    Instant now = Instant.now();
            //    for (int i = 0; i < 100; i++) {
            //
            //    }
            //    Instant now1 = Instant.now();
            //    System.out.println(now);
            //}

        }

        }
