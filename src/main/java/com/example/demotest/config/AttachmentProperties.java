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

    private String location;

    private String domain;

    private String allowFormat;

    private int maxSize;

    public List<String> getAllowFormat() {
        return Arrays.asList(allowFormat.split(","));
    }

}
