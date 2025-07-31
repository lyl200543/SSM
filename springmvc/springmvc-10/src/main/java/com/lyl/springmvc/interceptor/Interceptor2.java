package com.lyl.springmvc.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 *ClassName: Interceptor1
 *Package: com.lyl.springmvc.interceptor
 *Description:创建于 2025/7/31 16:48
 *@Author lyl
 *@Version 1.0
 */
@Component
public class Interceptor2 implements HandlerInterceptor {
    @Override
    public boolean preHandle (HttpServletRequest request , HttpServletResponse response , Object handler) throws Exception {
        System.out.println("执行Interceptor2#preHandle()方法...");
        return true;
    }

    @Override
    public void postHandle (HttpServletRequest request , HttpServletResponse response , Object handler , ModelAndView modelAndView) throws Exception {
        System.out.println("执行Interceptor2#postHandle()方法...");
    }

    @Override
    public void afterCompletion (HttpServletRequest request , HttpServletResponse response , Object handler , Exception ex) throws Exception {
        System.out.println("执行Interceptor2#afterCompletion()方法...");
    }
}
