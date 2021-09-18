package com.example.demotest.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: CityDTO
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/18 16:23
 */
@Data
public class CityDTO {

    @ApiModelProperty(value = "当前城市")
    private String city;


}
