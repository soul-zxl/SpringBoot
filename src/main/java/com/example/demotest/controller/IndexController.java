package com.example.demotest.controller;


import com.example.demotest.dto.CityDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping
public class IndexController {


    @GetMapping("/index")
    @ApiOperation(value = "",tags = "")
    public String index(){

        return "index";

    }
}
