package com.example.demotest.strategy;



import cn.hutool.core.date.DateTime;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.ss.formula.functions.Now;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
@Log4j2
public class Test {
      @org.junit.jupiter.api.Test
    public  void test() {

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

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);

    }

@org.junit.jupiter.api.Test
    public void format(){
    String format = DateFormatUtils.format(DateTime.now(), "yyyy-MM-dd")+"/";
    System.out.println(format);
    System.out.println(format.getClass().getName());
}

@org.junit.jupiter.api.Test
    public void sss() {
  List<Object> a = Arrays.asList();
      a.add(1);
    System.out.println(a);
}

}
