package edu.neu.hoso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//SpringBoot 测试
@RestController
public class TestController {
    @RequestMapping("/test")
    public String index(){
        return ("hello");
    }

}
