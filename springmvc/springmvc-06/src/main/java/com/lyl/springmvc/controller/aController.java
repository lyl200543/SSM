package com.lyl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *ClassName: aController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/22 17:38
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class aController {
    @RequestMapping ("/a")
    public String toA () {
//        return "a";
//        return "forward:/b";  //转发
        return "redirect:/b";  //重定向
    }


    @RequestMapping ("/b")
    public String toB () {
        return "b";
    }
}
