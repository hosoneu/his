package edu.neu.hoso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//SpringBoot 测试
@RestController
@RequestMapping("/hi")
public class TestController {
    @RequestMapping("/test")
    public String index(){
        System.out.println("jeladfas");
        return ("hello");
    }

}
