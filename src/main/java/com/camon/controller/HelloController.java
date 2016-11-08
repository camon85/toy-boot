package com.camon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

/**
 * Created by camon on 2016-11-03.
 */
@Controller
public class HelloController {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/redis")
    @ResponseBody
    public String redis() {
        Set<String> keys = redisTemplate.keys("*");
        return keys.toString();
    }
}
