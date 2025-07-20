package com.lyl.springmvc.controller;

import com.lyl.springmvc.pojo.User;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

/**
 *ClassName: UserController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/20 10:08
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class UserController {
    @RequestMapping ("/")
    public String toIndex () {
        return "register";
    }

//    @PostMapping ("/user/login")
//    public String register (HttpServletRequest request , HttpServletResponse response , HttpSession session) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String  sex = request.getParameter("sex");
//        String[] interst = request.getParameterValues("interst");
//        String intro = request.getParameter("intro");
//
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(sex);
//        System.out.println(Arrays.toString(interst));
//        System.out.println(intro);
//        return "ok";
//    }


//    @PostMapping ("/user/login")
//    public String register (
//            @RequestParam (value = "uname", required = false)
//            String username ,
//            @RequestParam ("password")
//            String password ,
//            @RequestParam (value = "sex", defaultValue = "1")
//            Integer sex ,
//            @RequestParam ("interst")
//            String interst ,
//            @RequestParam ("intro")
//            String intro
//    ) {
//
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(sex);
//        System.out.println(interst);
//        System.out.println(intro);
//        return "ok";
//    }


//    @PostMapping ("/user/login")
//    public String register (
//            String username,
//            String password,
//            Integer sex,
//            String interst ,
//            String intro
//    ) {
//
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(sex);
//        System.out.println(interst);
//        System.out.println(intro);
//        return "ok";
//    }


    @PostMapping ("/user/login")
    public String register (User user) {
        System.out.println(user);
        return "ok";
    }
}
