package com.lyl.springmvc.controller;

import com.lyl.springmvc.pojo.User;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *ClassName: AjaxController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/27 17:38
 *@Author lyl
 *@Version 1.0
 */
@RestController
public class AjaxController {
//    @GetMapping("/ajax")
//    public String testServletAPI(HttpServletResponse response ) throws IOException {
//        PrintWriter writer = response.getWriter();
//        writer.print("hello,i am springmvc");
//        return null;
//    }

//    @GetMapping("/ajax")
//    public void testServletAPI(HttpServletResponse response ) throws IOException {
//        PrintWriter writer = response.getWriter();
//        writer.print("hello,i am springmvc");
//    }

//    @GetMapping("/ajax")
//    @ResponseBody
//    public String testResponseBody(){
//        return "hello, i am ResponseBody";
//    }

    @GetMapping ("/ajax")
//    @ResponseBody
    public User testRBtoPojo () {
        return new User(1111L , "zhangsan" , "123456");
    }
}
