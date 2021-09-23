package com.example.demotest.entity;

import com.example.demotest.commom.BaseEntity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * @ClassName: weather
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/18 14:19
 */
@Data
@Builder
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Weather extends BaseEntity {
    @ApiModelProperty(value = "当前城市")
    private String city;

    @ApiModelProperty(value = "天气更新日期")
    private String updateTime;

    @ApiModelProperty(value = "当前日期")
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String date;

    @ApiModelProperty(value = "天气")
    @JsonSerialize()
    private String weather;

    @ApiModelProperty(value = "温度")
    private String temp;

    @ApiModelProperty(value = "风向")
    private String wind;

    @ApiModelProperty(value = "风级")
    private String direct;
}
