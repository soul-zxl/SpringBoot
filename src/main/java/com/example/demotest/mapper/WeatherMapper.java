package com.example.demotest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demotest.entity.Weather;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeatherMapper extends BaseMapper<Weather> {
}
