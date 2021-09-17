package com.example.demotest.controller;

import com.example.demotest.commom.Weather;
import com.example.demotest.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: WeatherController
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/17 17:45
 */

@RestController
@RequestMapping("we")
public class WeatherController {
    @Resource
    Weather weather;

    @GetMapping("/get")
    public String weather(){
         weather.getWeather();
        return "weather";

    }
}


