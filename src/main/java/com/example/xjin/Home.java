package com.example.xjin;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/demo")
    public String index() {
        return "Hello world";
    }
}
