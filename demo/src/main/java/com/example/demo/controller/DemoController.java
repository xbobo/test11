package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("deomo")
public class DemoController {

    @RequestMapping("/test")
    public String test(){
        return "hello,demo";
    }
}
