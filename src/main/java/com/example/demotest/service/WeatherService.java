package com.example.demotest.service;

/**
 * @ClassName: Weather
 * @Description:
 * @Author: zxl
 * @Date: 2021/9/17 15:22
 */

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demotest.constant.WeatherConstant;
import com.example.demotest.dto.CityDTO;
import com.example.demotest.entity.Weather;
import com.example.demotest.mapper.WeatherMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Log4j2
public class WeatherService extends ServiceImpl<WeatherMapper, Weather> {


    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;
    Map<String, Object> map = null;
    List<Weather> list = Arrays.asList();

    /**
     *
     */

    public void getWeather(CityDTO dto) {
        String URL = "https://query.asilu.com/weather/baidu/?city=" +dto.getCity();
        /**
         * getForEntity方法的返回值是一个
         * ResponseEntity<T>，ResponseEntity<T>是Spring对HTTP请求响应的封装，
         * 包括了几个重要的元素，如响应码、contentType、contentLength、响应消息体等。
         */
        //get请求   第一个参数为我要调用的服务的地址  ，第二个参数String.class表示我希望返回的body类型是String
        ResponseEntity<String> forEntity = restTemplate.getForEntity(URL, String.class);
        //身体信息
        String body = forEntity.getBody();
        try {
            // 转换成map
            map = objectMapper.readValue(body, Map.class);
            log.info("json数据" + map);
            String updateTime = (String) map.get(WeatherConstant.updateTime);
            log.info("天气的更新时间：" + updateTime);
            String nowDate = (String) map.get(WeatherConstant.nowDate);
            log.info("当前日期：" + nowDate);
            List Content = (List) map.get(WeatherConstant.weatherContent);
            for (Object value : Content) {
                Map<String, Object> result = (Map) value;
                String info = (String) result.get(WeatherConstant.INFO);
                log.info("天气情况" + info);
                String temp = (String) result.get(WeatherConstant.TEMPERATURE);
                log.info("温度:" + temp);
                String POWER = (String) result.get(WeatherConstant.POWER);
                log.info("风向" + POWER);
                String wind = (String) result.get(WeatherConstant.wind);
                log.info("风力" + wind);
                String date = (String) result.get(WeatherConstant.nowDate);
                log.info("日期" + wind);
                Weather build = Weather.builder()
                        .weather(info)
                        .city(dto.getCity())
                        .wind(wind)
                        .temp(temp)
                        .date(date)
                        .direct(POWER)
                        .updateTime(updateTime)
                        .build();
                super.save(build);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Scheduled(cron = "0 0/5 * * * ? ")
    public void configureTasks(){
        log.info("每五分钟定时打印一次时间"+ LocalDateTime.now());
        List<Integer> collect =this.list.stream()
                .map((a) -> a.getId())
                .collect(Collectors.toList());
        this.removeByIds(collect);
    }



public List<Weather> weatherList(CityDTO dto){
     getWeather(dto);
    LambdaQueryWrapper<Weather> query= Wrappers.lambdaQuery();
    query.eq(Weather::getCity,dto.getCity());
    List<Weather> list = super.list(query);

//    QueryWrapper <Weather>wrapper = new QueryWrapper<>();
//    wrapper.lambda().eq(Weather::getCity,dto.getCity());
//    List<Weather> list = this.list(wrapper);
    return list;
}

}
