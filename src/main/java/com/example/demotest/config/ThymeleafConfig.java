package com.example.demotest.config;

import org.assertj.core.internal.bytebuddy.build.ToStringPlugin;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName: Thymeleaf
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/24 11:33
 */
@Component
@ConfigurationProperties(
        prefix = "spring.thymeleaf"
)
public class ThymeleafConfig {
    private static final Charset DEFAULT_ENCODING= StandardCharsets.UTF_8;
    public static final String DEFAULT_PREFIX = "classpath:/templates/";
    public static final String DEFAULT_SUFFIX = ".html";
    private boolean checkTemplate = true;
    private boolean checkTemplateLocation = true;
    private String prefix = "classpath:/templates/";
    private String suffix = ".html";
    private String mode = "HTML";
    private Charset encoding;

}
