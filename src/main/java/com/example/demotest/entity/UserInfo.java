package com.example.demotest.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.*;
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
public class UserInfo implements Serializable {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private int id;

    private String userName;

    private String passWord;

    private String role;

}