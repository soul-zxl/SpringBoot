package com.example.demotest.entity;


import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("sys_logininfor")
@ApiModel(value = "登录日志")
public class LoginInfo {
    @ApiModelProperty("访问ID")
    private long infoId;

    @ApiModelProperty("登录账号")
    private String loginName;

    @ApiModelProperty("")
    private String ipaddr;

    @ApiModelProperty("")
    private String loginLocation;

    @ApiModelProperty("")
    private String browser;

    @ApiModelProperty("")
    private String os;

    @ApiModelProperty("")
    private char status;

    @ApiModelProperty("")
    private String msg;

    @ApiModelProperty("")
    private DateTime loginTime;

}
