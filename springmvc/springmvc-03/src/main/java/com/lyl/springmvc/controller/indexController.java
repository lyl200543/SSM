package com.lyl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *ClassName: indexController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/18 18:43
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class indexController {
    @RequestMapping ("/")
    public String index () {
        return "index";
    }

    @RequestMapping (value = {"/test1" , "/test2"})
    public String testValueArray () {
        return "test";
    }

    //    @RequestMapping("/x?z")
//    @RequestMapping("/x*z")
    @RequestMapping ("/a/**")
    public String testAntValue () {
        return "ok";
    }

    @RequestMapping ("/login/{a}/{b}")
    public String testRestfulURL (
            @PathVariable ("a")
            String username ,
            @PathVariable ("b")
            String password
    ) {
        System.out.println("用户名：" + username + ",密码：" + password);
        return "ok";
    }

//    @RequestMapping (value = "/user/login", method = RequestMethod.POST)
    @PostMapping("/user/login")
    public String testMethod () {
        return "ok";
    }
}
