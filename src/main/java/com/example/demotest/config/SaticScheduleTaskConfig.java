package com.example.demotest.config;



import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demotest.dto.CityDTO;
import com.example.demotest.entity.Weather;
import com.example.demotest.service.WeatherService;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@Configuration
//开启定时任务
@EnableScheduling
public class SaticScheduleTaskConfig {

    @Resource
    WeatherService weatherService;


    @Scheduled(cron = "0/10 * * * * ?")
    public void configureTasks2(){
        log.info("每十秒定时打印一次时间"+ LocalDateTime.now());
    }

}
