package com.example.demotest.controller;


import com.example.demotest.commom.BaseDTO;
import com.example.demotest.service.QuestionService;
import com.example.demotest.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "题库",tags = "题库API")
@RequestMapping("question")
public class questionController {
    @Autowired
    QuestionService questionService;

    @PostMapping("News")
    @ApiOperation("访问数量")
    public ResponseEntity num(@RequestParam BaseDTO baseDTO){
        int readNum = questionService.readNum(baseDTO.getId());
        return  ResultUtil.success(readNum);
    }

}
