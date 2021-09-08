package com.example.demotest.service;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demotest.commom.BaseDTO;
import com.example.demotest.entity.QuestionBank;
import com.example.demotest.mapper.QuestionMapper;
import com.example.demotest.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Queue;

@Service
public class QuestionService extends ServiceImpl<QuestionMapper, QuestionBank> {
    RedisUtil redisUtil;
    @Autowired
    QuestionMapper questionMapper;

    public Boolean addQuestion(QuestionBank bizQuestionBank) {

        return false;
    }

    /**
     * 点击新闻阅读量加1
     *
     * @param id
     * @return
     */
    public int readNum(int id) {
        QuestionBank questionBank = new QuestionBank();
        //  判断是否存在
        Integer newNum = (Integer) redisUtil.get("newNmu" + id);
        //缓存中位空则到数据中查找
        if (newNum == null) {
            QueryWrapper<QuestionBank> num = new QueryWrapper<>();
            String readNum = questionMapper.selectById(id).getReadNum();
            if (StrUtil.isNotEmpty(readNum)) {
                return 0;
            }
            //          存入缓存中
            long newHits = Long.parseLong(questionBank.getReadNum()) + 1;
            redisUtil.set("newNmu" + id, newHits);
            return newNum;
        }
        //如果荒村中存在
        //String s = String.valueOf(newNum);
        redisUtil.incr("newNmu"+id,1);
        Integer l = Integer.valueOf(String.valueOf(newNum));
        return l;
    }
}
