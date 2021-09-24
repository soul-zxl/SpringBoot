package com.example.demotest.controller;


import com.example.demotest.dto.CityDTO;
import com.example.demotest.entity.Weather;
import com.example.demotest.service.WeatherService;
import com.example.demotest.util.ResultUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    WeatherService weatherService;

    @PostMapping("/get")
    @ApiOperation(value = "",tags = "")
    public ResponseEntity<List<Weather>> weather(@RequestBody CityDTO dto){
        List<Weather> list = weatherService.weatherList(dto);
        return ResultUtil.success("",list);

    }
}


