package com.example.demotest.config;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.JSONToken;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.demotest.util.JwtUtil;
import com.example.demotest.util.MessageUtils;
import com.example.demotest.util.RedisUtil;
import com.example.demotest.util.ResultUtil;
import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @author Administrator
 */
@Log4j2
@Component
public class JwtTokenInterceptorConfig {
    @Autowired
    RedisUtil redisUtil;

    public Boolean verifyToken(HttpServletRequest request) throws Exception {
        //需要转换成String类型
        String token = JSON.toJSONString(request.getHeader("Authorization"));
        //校验token是否完整
        boolean verify = JwtUtil.verify(token);
        //解析token,并获取key
        String name = JwtUtil.verifyToken(token);
        log.info(name);
        String redisToken = (String) redisUtil.get(name);
        if (verify == true) {
            if (StringUtils.isEmpty(token)) {
                throw new Exception(MessageUtils.message("token为空"));
            }
            if (verify) {
                if (StringUtils.equals(token, redisToken)) {
                    return false;
                } else {
                    return true;
                }

            } else {
                return false;

            }
        } else {
            return false;
        }

    }
}
