package com.example.demotest.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class Activity {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "id")
    private int id;


    private String descriptionChi;

    private Date startDate;

    private Date endDate;

    private Date signStartDate;

    private Date signEndDate;

    private String coverUrl;

    private String address;

    private String details_top_pic;

    private String content;

    private String sponsor;

    private Date publishTime;

    private Boolean publishStatus;

    private Boolean topFlag;

}
