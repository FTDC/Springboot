package com.example.xjin;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	// 测试方法
    @RequestMapping("/demo")
    public String index() {
        return "Hello world";
    }
}
