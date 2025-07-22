package com.lyl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *ClassName: indexController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/22 17:35
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }
}
