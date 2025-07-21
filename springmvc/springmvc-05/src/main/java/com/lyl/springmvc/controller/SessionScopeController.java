package com.lyl.springmvc.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *ClassName: SessionScopeController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/21 9:58
 *@Author lyl
 *@Version 1.0
 */
@Controller
@SessionAttributes ({"x" , "y"})
public class SessionScopeController {
    @RequestMapping ("/testSessionServlet")
    public String testSessionServlet (HttpSession session) {
        session.setAttribute("testSessionScope" , "在SpringMVC中使用原生Servlet API实现session域数据共享");
        return "ok";
    }

    @RequestMapping ("/testSessionAttribute")
    public String testSessionAttribute (Model model) {
        model.addAttribute("x" , "我是x");
        model.addAttribute("y" , "我是y");
        return "ok";
    }
}
