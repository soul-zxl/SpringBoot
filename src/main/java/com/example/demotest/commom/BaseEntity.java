package com.example.demotest.commom;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

/**
 * @author linsidi
 */
@Getter
@Setter
public class BaseEntity {
    /**
     * 主键
     */
    @TableId(value = "id",type = IdType.ID_WORKER_STR)
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

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
    @TableField(value = "deleted")
    private Boolean deleted;


}

