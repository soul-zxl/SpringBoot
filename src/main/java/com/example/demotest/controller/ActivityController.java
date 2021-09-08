package com.example.demotest.controller;


import com.example.demotest.commom.BaseDTO;
import com.example.demotest.entity.Activity;
import com.example.demotest.service.ActivityService;
import com.example.demotest.util.ResultUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("activity")
@RestController
public class ActivityController {
    @Resource
    ActivityService activityService;


    @PostMapping("page")
    @ApiOperation("活动查询")
    public ResponseEntity<Activity> page(@RequestBody Activity dto) {
        Activity page = activityService.page(dto);
        return ResultUtil.success(page);
    }

    @PostMapping("insert")
    @ApiOperation("添加活动")
    public ResponseEntity insert(@RequestBody Activity dto) {
//        dto.setPublishStatus(false);
//        dto.setTopFlag(false);
        activityService.save(dto);
        return ResultUtil.success();
    }

    @PostMapping("delete")
    @ApiOperation("删除活动")
    public ResponseEntity delete(@RequestBody BaseDTO dto) {
//        dto.setPublishStatus(false);
//        dto.setTopFlag(false);
        this.activityService.removeById(dto.getId());
        return ResultUtil.success();
    }
}
