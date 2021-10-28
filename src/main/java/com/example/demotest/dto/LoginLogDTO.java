package com.example.demotest.dto;

import com.example.demotest.commom.BasePagerDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "LoginLogDTO",description = "日志DTO")
public class LoginLogDTO  extends BasePagerDTO {


    @ApiModelProperty("登录地址")
    private String ipaddr;

    @ApiModelProperty("用户名称")
    private String userName;

    @ApiModelProperty("状态")
    private char status;


}
