package com.example.demotest.config;



import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Log4j2
@Configuration
//开启定时任务
@EnableScheduling
public class SaticScheduleTaskConfig {
    @Scheduled(cron = "0/5 * * * * ?")
    public void configureTasks1(){
        log.info("每五秒定时打印一次时间"+ LocalDateTime.now());
    }
    @Scheduled(cron = "0/10 * * * * ?")
    public void configureTasks2(){
        log.info("每十秒定时打印一次时间"+ LocalDateTime.now());
    }

}
