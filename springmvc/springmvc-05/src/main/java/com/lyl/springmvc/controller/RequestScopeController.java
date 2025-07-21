package com.lyl.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.Objects;

/**
 *ClassName: RequestScopeController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/20 18:10
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class RequestScopeController {
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request){
        request.setAttribute("testRequestScope", "在SpringMVC中使用原生Servlet API实现request域数据共享");
        return "ok";
    }

    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","在SpringMVC中使用Model接口实现request域数据共享");
        return "ok";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map){
        map.put("testRequestScope", "在SpringMVC中使用Map接口实现request域数据共享");
        return "ok";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope", "在SpringMVC中使用ModelMap实现request域数据共享");
        return "ok";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("testRequestScope", "在SpringMVC当中使用ModelAndView类完成request域数据共享");
        mav.setViewName("ok");
        return mav;

    }
}
