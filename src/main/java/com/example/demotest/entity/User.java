package com.example.demotest.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.AccessType;

import java.io.Serializable;

@Accessors(chain = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
public class User implements Serializable {

   private Integer id;

    private String userName;

    private String passWord;

    private String role;

}