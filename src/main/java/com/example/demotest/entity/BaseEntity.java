package com.example.demotest.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * @author linsidi
 */
@Data
@NoArgsConstructor
public class BaseEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

    /**
     * 创建者
     */

    @TableField(value = "created_by", fill = FieldFill.INSERT)
    private String createdBy;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "GMT+8")
    @TableField(value = "created_date", fill = FieldFill.INSERT)
    private Instant createdDate;

    /**
     * 更新者
     */
    @TableField(value = "last_modified_by",fill = FieldFill.INSERT_UPDATE)
    private String lastModifiedBy;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "GMT+8")
    @TableField(value = "last_modified_date", fill = FieldFill.INSERT_UPDATE)
    private Instant lastModifiedDate;

    /**
     * 有效性
     */
//    @TableLogic
    @TableField(value = "deleted")
    @ApiModelProperty(value = "有效性）")
    private Boolean deleted;


}

