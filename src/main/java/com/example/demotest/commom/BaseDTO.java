package com.example.demotest.commom;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 *@description 描述 通用DTO
 *@author 作者 adi
 *@createTime 创建时间  2021/3/1 上午11:16
 *@other 修改人和其它信息
 */
@Data
@ApiModel(value="BaseDTO", description="公共请求参数")
public class BaseDTO implements Serializable {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "主键id数组")
    private String[] ids;
    @ApiModelProperty(value = "文件MultipartFile",dataType = "file")
    private MultipartFile file;
    @ApiModelProperty(value = "文件MultipartFile数组",dataType = "file")
    private MultipartFile[] files;
}
