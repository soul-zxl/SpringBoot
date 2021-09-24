package com.example.demotest.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author KPQ
 * @date 2021/9/16
 */
@Data
@Accessors(chain = true)
public class StorageVO {

    @ApiModelProperty("相对路径")
    private String relativePath;

    @ApiModelProperty("绝对路径")
    private String absolutePath;

}
