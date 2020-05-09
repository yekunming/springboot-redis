package ccom.newer.ye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RedisServiceImpl {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    public void addString(){
        redisTemplate.opsForValue().set("springboot", "13");
        redisTemplate.opsForValue().set("data", new Date());
    }
    public void getString(){
        Date data = (Date) redisTemplate.opsForValue().get("data");
        String value = (String) redisTemplate.opsForValue().get("springboot");
        System.out.println(data+"---"+value);
        System.out.println("231");
    }


}
