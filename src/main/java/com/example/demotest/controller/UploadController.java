package com.example.demotest.controller;

import cn.hutool.core.lang.Assert;
import com.example.demotest.service.FileUploadService;
import io.swagger.annotations.Api;
import io.swagger.models.Model;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName: UploadController
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/24 11:42
 */

@Log4j2
//注意:
// 这里只能用@Controller不能用@RestController,
// 后者会直接输出json格式的/index,而不是跳转页面
@Controller
@Api(value = "文件上传", tags = "文件上传")
public class UploadController {

    @Autowired
    FileUploadService fileUploadService;


    @GetMapping(value = "/upload")
    public String fileUpload(@RequestParam("file") MultipartFile file)  {
        //Assert.isNull(file.isEmpty(),"NULL");
        //获取上传文件名
        String fileName = file.getOriginalFilename();
        //获取后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //存放路径
        String filePath = "C:\\Users\\Administrator\\Desktop\\jpg\\";
        //在一台机器上生成的数字，它保证对在同一时空中的所有机器都是唯一的
        //获取新的文件名
        String name = UUID.randomUUID() + suffixName;
        //创建文件+路径
        File dost = new File(filePath+name);

        try {
            file.transferTo(dost);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("类型吗？？？"+file.getContentType());
        return "index";
    }

}
