package com.lyl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

/**
 *ClassName: indexController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/31 16:44
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public String toIndex(){
        System.out.println("执行indexController#toIndex()方法...");
        return "index";
    }

    @RequestMapping("/ok")
    public String toOk(){
        System.out.println("执行indexController#toOk()方法...");
        return "ok";
    }
}
