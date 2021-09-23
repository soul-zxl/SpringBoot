package com.example.demotest.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: WeatherVO
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/23 15:23
 */
@Data
public class WeatherVO {


    @ApiModelProperty(value = "当前城市")
    private String city;

    @ApiModelProperty(value = "天气")
    @JsonSerialize()
    private String weather;

    @ApiModelProperty(value = "温度")
    private String temp;

    @ApiModelProperty(value = "风向")
    private String wind;

    @ApiModelProperty(value = "风级")
    private String direct;

    @ApiModelProperty(value = "天气更新日期")
    private String updateTime;
}
