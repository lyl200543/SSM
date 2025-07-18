package com.lyl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *ClassName: UserController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/18 18:36
 *@Author lyl
 *@Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
//    @RequestMapping("/user/detail")
    @RequestMapping("/detail")
    public String user_detail(){
        return "user_detail";
    }
}
