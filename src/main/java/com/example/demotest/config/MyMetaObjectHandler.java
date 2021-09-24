package com.example.demotest.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.assertj.core.util.DateUtil;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName: MyMetaObjectHandler
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/18 16:02
 */
//
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"created_date", LocalDate.class,LocalDate.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject,"last_modified_date", LocalDate.class, LocalDate.now());    }
}
