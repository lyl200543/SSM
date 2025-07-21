package com.lyl.springmvc.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *ClassName: ApplicationScopeController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/21 10:07
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class ApplicationScopeController {
    @RequestMapping ("/testApplicationServlet")
    public String testApplicationServlet (HttpServletRequest request) {
        ServletContext application = request.getServletContext();
        application.setAttribute("testApplicationScope" , "在SpringMVC中使用原生Servlet API实现application域数据共享");
        return "ok";
    }
}
