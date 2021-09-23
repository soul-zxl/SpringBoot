package com.example.demotest.controller;

import com.example.demotest.entity.User;
import com.example.demotest.util.ExcelUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log4j2
@RestController
@Api(value = "Excel导出", tags = "Excel导出")
@RequestMapping("excel")
public class ExcelController {


    @PostMapping("export")
    @ApiOperation(value = "输入")
    public void export(HttpServletResponse response) {
        /**
         * Arrays.asList()不支持add,remove
         */
        List<User> userList = new ArrayList<>();
          //List<User> userList = Arrays.asList();
        User user = new User()
                .setId(1)
                .setName("1")
                .setPass("123456");
        User user1 = new User()
                .setId(2)
                .setName("2")
                .setPass("zxl");
        userList.add(user);
        userList.add(user1);

        ExcelUtil.exportExcel
                (userList, "花名册", "草帽一伙", User.class, "用户花名册.xlsx", response);

    }


    @PostMapping("importExcel")
    @ApiOperation(value = "输出")
    public void importExcel() {
        String filePath = "C:\\Users\\Administrator\\Desktop\\用户花名册.xlsx";
        //解析excel，
        List<User> userList = ExcelUtil.importExcel(filePath, 1, 1, User.class);
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        System.out.println("导入数据一共【" + userList.size() + "】行");
    }

}
