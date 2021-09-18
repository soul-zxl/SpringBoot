package com.example.demotest.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.assertj.core.util.DateUtil;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName: MyMetaObjectHandler
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/18 16:02
 */
//
//@Slf4j
//@Component
//public class MyMetaObjectHandler implements MetaObjectHandler {
//    @Override
//    public void insertFill(MetaObject metaObject) {
//        this.setFieldValByName("createTime", new Date(), metaObject);
//        this.setFieldValByName("updateTime", new Date(), metaObject);
//    }
//
//    @Override
//    public void updateFill(MetaObject metaObject) {
//        this.setFieldValByName("updateTime",new Date(), metaObject);
//    }
//}
