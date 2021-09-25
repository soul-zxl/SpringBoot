package com.example.demotest.strategy;



import com.baomidou.mybatisplus.generator.AutoGenerator;
import lombok.extern.log4j.Log4j2;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
@Log4j2
public class Test {

    public static void main(String[] args) {

        //String encode = Base64.getEncoder().encodeToString("GOOD".getBytes("UTF-8"));
        //System.out.println("encode:"+encode);
        //byte[] decode = Base64.getDecoder().decode(encode);
        //System.out.println(new String(decode, "UTF-8"));



        //List<String> strings = Arrays.asList("alpha","beta","gamma");
        //Integer collect = strings.stream().collect(Collectors.summingInt(String::length));
        //System.out.println(collect);
        //
        //LocalDate now = LocalDate.now();
        //System.out.println("月份"+now.getMonth().getValue());

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        LocalDate now1 = LocalDate.now();
//        System.out.println(now1);


        AutoGenerator mpg = new AutoGenerator();


    }

}
