package com.example.demotest.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demotest.entity.Activity;
import com.example.demotest.mapper.ActivityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ActivityService  extends ServiceImpl<ActivityMapper, Activity> {

     @Resource
    ActivityMapper activityMapper;

     public  Activity page(Activity activity){
         Activity page = activityMapper.page(activity);
         return page;
     }



}
