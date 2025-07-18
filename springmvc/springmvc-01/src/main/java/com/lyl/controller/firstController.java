package com.lyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *ClassName: firstController
 *Package: com.lyl.controller
 *Description:创建于 2025/7/17 17:27
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class firstController {
    @RequestMapping ("/test1")
    public String sample1 () {
        return "first";
    }

    @RequestMapping("/test2")
    public String sample2(){
        return "other";
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
