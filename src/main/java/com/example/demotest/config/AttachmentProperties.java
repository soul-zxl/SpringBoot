package com.example.demotest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author KPQ
 * @date 2021/9/13
 */
@ConfigurationProperties(prefix = "attachment")
@Component
@Data
public class AttachmentProperties {
//本地地址
    private String location;
//线上路径
    private String domain;
//上传格式
    private String allowFormat;
//最大容量
    private int maxSize;

    public List<String> getAllowFormat() {
        return Arrays.asList(allowFormat.split(","));
    }

}
