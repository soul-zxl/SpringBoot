package com.example.demotest.controller;

import cn.hutool.core.lang.Assert;
import com.example.demotest.service.FileUploadService;
import com.example.demotest.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.models.Model;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity fileUpload(@RequestParam("file") MultipartFile file) {
     fileUploadService.upload(file,true);

       return ResultUtil.success("");
    }


}
