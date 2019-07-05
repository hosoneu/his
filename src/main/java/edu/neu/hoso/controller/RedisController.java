package edu.neu.hoso.controller;


import edu.neu.hoso.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//Redis 测试
@RestController
public class RedisController {
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtils redisUtils;

    @RequestMapping("/redis")
    public void t1() {
//        Role role = (Role) redisTemplate.opsForValue().get("role_1");
        String key = "alan";
        redisUtils.set(key, "handsome");
        String result = (String)redisUtils.get(key);
        System.out.println(result);

        String str = redisTemplate.opsForValue().get(key).toString();

        System.out.println(str);
    }
}
