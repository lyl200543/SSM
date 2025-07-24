package com.lyl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *ClassName: UserController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/24 17:22
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class UserController {
    @GetMapping ("/user")
    public String getAll () {
        System.out.println("正在展示所有用户信息...");
        return "ok";
    }

    @GetMapping ("/user/{id}")
    public String get (@PathVariable ("id") String id) {
        System.out.println("正在展示" + id + "号用户信息...");
        return "ok";
    }

    @PostMapping ("/user")
    public String save () {
        System.out.println("正在保存用户信息...");
        return "ok";
    }

    @PutMapping ("/user")
    public String modify () {
        System.out.println("正在修改用户信息...");
        return "ok";
    }

    @DeleteMapping ("/user/{id}")
    public String del (@PathVariable ("id") String id) {
        System.out.println("正在删除" + id + "号用户信息...");
        return "ok";
    }
}
