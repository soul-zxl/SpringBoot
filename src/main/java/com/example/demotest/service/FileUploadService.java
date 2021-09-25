package com.example.demotest.service;

import com.example.demotest.config.AttachmentProperties;
import com.example.demotest.util.AttachmentUtils;
import com.example.demotest.vo.StorageVO;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/**
 * @ClassName: fileUploadService
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/24 15:46
 */
@Service
@Log4j2
public class FileUploadService {

    @Autowired
    AttachmentProperties properties;

    public StorageVO upload(@NonNull MultipartFile file, boolean rename) {
//        格式大小校验
        validate(file);

        String dir = properties.getLocation() + datePath();
        //获取图片路径（格式）  相对路径
        String relativePath = AttachmentUtils.upload(file, dir, rename);
        //上传路径+图片名     绝对路径
        String absolutePath = properties.getDomain() + relativePath;
        StorageVO storage = new StorageVO().setRelativePath(relativePath)
                .setAbsolutePath(absolutePath);
        return storage;
    }

    /*
    判断文件大小、格式
     */
    private void validate(MultipartFile file) {
        //FilenameUtils.getExtension();  获取后缀
        String extension = FilenameUtils.getExtension(file.getOriginalFilename()).toLowerCase();
        //获取配置的后缀名
        List<String> formatList = properties.getAllowFormat();
        //最大的上传大小
        int maxSize = properties.getMaxSize() * 1024 * 1024;
        //      判断元素内是否包含
        Assert.isTrue(formatList.contains(extension), "请上传" + formatList.toString() + "格式");
        Assert.isTrue(file.getSize() <= maxSize, "上传文件大小不能超过" + properties.getMaxSize() + "M");
    }

    private static String datePath() {
//        创建文件夹
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyy/MM/dd") + "/";
    }

}



