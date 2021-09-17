package com.example.demotest.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demotest.entity.QuestionBank;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: activice
 * @Description:
 * @Author: Administrator
 * @Date: 2021/9/8 17:51
 */
@Mapper
public interface ActiviceMapper extends BaseMapper<QuestionBank> {

    public QuestionBank page(@Param("dto") QuestionBank dto);


}
