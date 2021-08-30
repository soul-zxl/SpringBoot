package com.example.demotest.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demotest.entity.QuestionBank;
import com.example.demotest.mapper.QuestionMapper;
import com.example.demotest.util.RedisUtil;
import org.springframework.stereotype.Service;

@Service
public class Question extends ServiceImpl<QuestionMapper,QuestionBank> {
       RedisUtil redisUtil;


    public Boolean addQuestion(QuestionBank bizQuestionBank){

        return false;
    }
    //todo阅读量
    public int readNum(QuestionBank bizQuestionBank){


        return 1;
    }
}
