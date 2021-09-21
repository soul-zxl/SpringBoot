package com.example.demotest.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
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
public class User implements Serializable {

 @Excel(name = "id",orderNum = "0")
  private Integer id;
@Excel(name = "名字",orderNum = "1")
  private String name;
@Excel(name = "密码",replace = {"男_1,女_2"},orderNum = "2")
  private String pass;

}