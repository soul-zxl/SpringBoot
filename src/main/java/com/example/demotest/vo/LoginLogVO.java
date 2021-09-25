package com.example.demotest.vo;


import cn.hutool.core.date.DateTime;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class LoginLogVO implements Serializable {

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
