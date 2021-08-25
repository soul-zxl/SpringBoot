package com.example.demotest.config;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.example.demotest.util.JwtUtil;
import com.example.demotest.util.MessageUtils;
import com.example.demotest.util.RedisUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;


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
