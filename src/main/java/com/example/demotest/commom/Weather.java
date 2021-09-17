package com.example.demotest.commom;

/**
 * @ClassName: Weather
 * @Description:
 * @Author: zxl
 * @Date: 2021/9/17 15:22
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
@Service
@Log4j2
public class Weather {


    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;


    /**
     *
     */

    public  void getWeather() {
        String URL="http://aider.meizu.com/app/weather/listWeather?cityIds=101230201";
        /**
         * getForEntity方法的返回值是一个
         * ResponseEntity<T>，ResponseEntity<T>是Spring对HTTP请求响应的封装，
         * 包括了几个重要的元素，如响应码、contentType、contentLength、响应消息体等。
         */
        //get请求   第一个参数为我要调用的服务的地址  ，第二个参数String.class表示我希望返回的body类型是String
        ResponseEntity<String> forEntity = restTemplate.getForEntity(URL, String.class);
        //身体信息
        String body = forEntity.getBody();
        // 转换成map
        Map<String, Object> map = null;
        try {
            map = objectMapper.readValue(body, Map.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("json数据"+map);
        LinkedHashMap<String, Object> value = (LinkedHashMap) map.get("value");
        log.info("获取vlues值"+value);









    }

}
