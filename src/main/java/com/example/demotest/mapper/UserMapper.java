package com.example.demotest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demotest.entity.LoginInfo;
import com.example.demotest.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
