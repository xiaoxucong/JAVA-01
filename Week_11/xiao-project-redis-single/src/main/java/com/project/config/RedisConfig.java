package com.project.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
/**
 * Redis数据源配置类
 * @Title
 * @description
 * @author 黄泉
 *
 */
@Configuration
public class RedisConfig {

    @Bean(name = {"redisTemplate", "stringRedisTemplate"})
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factoary){
        StringRedisTemplate redisTemplate = new StringRedisTemplate();
        redisTemplate.setConnectionFactory(factoary);
        return redisTemplate;
    }


}

