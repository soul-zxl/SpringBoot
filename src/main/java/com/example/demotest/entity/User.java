package com.example.demotest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


  private Integer id;

  private String name;

  private String pass;

}