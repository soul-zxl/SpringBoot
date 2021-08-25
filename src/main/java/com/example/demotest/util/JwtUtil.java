package com.example.demotest.util;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.example.demotest.entity.User;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
//JWT 工具类
//工具类中包含：创建 token，验证 token，获取用户 id 等
public class JwtUtil {
    @Autowired
    static RedisUtil redisUtil;
    /*
     * 密钥
     * */
    public static final String SECRET = "asurplus_secret";


    /*
     * 过期时间 单位(秒)
     * */

    private static final long EXPIRATION = 3600L;


    //生成一个token
    public static String createToken(User user) {
        HashMap<String, Object> map = new HashMap<>();
        //声明加密算法
        map.put("alg", "HS512");
        //声明类型
        map.put("tye", "JWT");
        //创建一个token
        String token = JWT.create()
                //放入头部信息
                .withHeader(map)
                ////设置 载荷 签名是有谁生成 例如 服务器
                .withIssuer("SERVICE")
                ///设置 载荷 签名的主题
                .withSubject("")
                //设置 载荷 签名的观众 也可以理解谁接受签名的
                .withAudience("??????")
                //可以将基本信息放到claims中
                .withClaim("username", user.getName())
                .withClaim("password", user.getPass())
                // 超时设置,设置过期的日期
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION * 1000))
                // 签发时间
                .withIssuedAt(new Date())
                // SECRET加密
                .sign(Algorithm.HMAC256(SECRET));
        log.info("当前的token值：" + token);
        //redisUtil.set(user.getName(), JwtUtil.createToken(user));
        return token;
    }


    //解析token
    public static String  verifyToken(String token) {

        //构建密钥信息
        Algorithm algorithm = Algorithm.HMAC256(SECRET);
        //通过密钥信息和签名的发布者的信息生成JWTVerifier (JWT验证类)
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("SERVICE")
                .build();

        DecodedJWT jwt = verifier.verify(token);
        String subject = jwt.getSubject();
        List<String> audience = jwt.getAudience();
        Map<String, Claim> claims = jwt.getClaims();

        for (Map.Entry<String, Claim> entry : claims.entrySet()) {
            String key = entry.getKey();
            Claim claim = entry.getValue();
            System.out.println("key:" + key + " value:" + claim.asString());
        }
        //获取claims中的内容
        Claim username = claims.get("username");
        String name = username.asString();
        log.info(username);
        Claim password = claims.get("password");
        log.info(password);
        log.info(subject);
        log.info(audience.get(0));

        return name;
    }


    //验证token
    public static boolean verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            com.auth0.jwt.interfaces.JWTVerifier verifier = JWT.require(algorithm).build();
            verifier.verify(token);
            return true;
        } catch (Exception e) {
            log.error("验证token Error", e);
            return false;
        }
    }
}