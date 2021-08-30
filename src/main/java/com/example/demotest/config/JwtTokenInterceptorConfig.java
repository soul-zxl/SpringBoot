package com.example.demotest.config;
import com.alibaba.druid.util.StringUtils;
import com.example.demotest.util.JwtUtil;
import com.example.demotest.util.MessageUtils;
import com.example.demotest.util.RedisUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author Administrator
 */
@Log4j2
@Component
public class JwtTokenInterceptorConfig {
    RedisUtil redisUtil;

    public Boolean verifyToken(String token) throws Exception {
        String[] strs = token.split(" ");
        token = strs[1];
        //校验token是否完整
        boolean verify = JwtUtil.verify(token);
        //解析token,并获取key
        String name = JwtUtil.verifyToken(token);
        //log.info(name);
        String redisToken = (String) redisUtil.get(name);
        if (verify == true) {
            if (StringUtils.isEmpty(token)) {
                throw new Exception(MessageUtils.message("token为空"));
            }else {
                if (StringUtils.equals(token, redisToken)) {
                    return false;
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }

    }
}
