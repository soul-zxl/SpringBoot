package com.example.demotest.controller;


import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demotest.commom.BaseDTO;
import com.example.demotest.dto.CityDTO;
import com.example.demotest.dto.LoginLogDTO;
import com.example.demotest.entity.LoginInfo;
import com.example.demotest.entity.Weather;
import com.example.demotest.service.LoginLogService;
import com.example.demotest.util.MessageUtils;
import com.example.demotest.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
@Api(value = "登录日志", tags = "登录日志API")
@RestController
@RequestMapping("login")
public class LoginLogControlller {

    @Resource
    LoginLogService loginLogService;


    @GetMapping("page")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "登录地址", value = "ipaddr", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "用户名称", value = "userName", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "状态", value = "status", dataType = "Integer", paramType = "query")
    })
    public ResponseEntity<Page<LoginLogDTO>> page(
            @RequestParam(value = "ipaddr", required = false) String ipaddr,
            @RequestParam(value = "userName", required = false) String userName,
            @RequestParam(value = "status", required = false) char status) {
        LoginLogDTO dto = new LoginLogDTO();
        dto.setIpaddr(ipaddr);
        dto.setStatus(status);
        dto.setUserName(userName);
        Page page = loginLogService.findPage(dto);

        return ResultUtil.success(page);
    }


    @PostMapping("deldte")
    @ApiOperation(value = "删除", tags = "删除API")
    public ResponseEntity delete(@RequestBody BaseDTO dto) {
        Assert.isNull(dto.getIds(), MessageUtils.message("id must"));
        loginLogService.removeByIds(Arrays.asList(dto.getIds()));
        return ResultUtil.success();
    }

    @PostMapping("insert")
    @ApiOperation(value = "添加", tags = "添加API")
    public ResponseEntity add(@RequestBody LoginInfo dto) {
       loginLogService.save(dto);
        return ResultUtil.success();
    }


}
