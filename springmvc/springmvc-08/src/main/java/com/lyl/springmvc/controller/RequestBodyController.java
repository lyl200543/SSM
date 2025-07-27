package com.lyl.springmvc.controller;

import com.lyl.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *ClassName: RequestBodyController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/27 18:21
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class RequestBodyController {
    @PostMapping("/save")
    public String save(@RequestBody String str){
        System.out.println(str);
        return "ok";
    }

    @PostMapping("/jsonSave")
    @ResponseBody
    public String jsonSave(@RequestBody User user){
        System.out.println(user);
        return "success";
    }
}
