package com.example.demotest.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(fluent = true)
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;


}

