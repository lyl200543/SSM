package com.lyl.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *ClassName: SecurityAspect
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/6/1 15:43
 *@Author lyl
 *@Version 1.0
 */
@Component
@Aspect
@Order (1)
public class SecurityAspect {
    @Before ("com.lyl.spring6.service.LogAspect.general()")
    public void beforeAdvice () {
        System.out.println("前置通知：安全...");
    }

    @AfterReturning ("execution(* com.lyl.spring6.service..*(..))")
    public void afterReturningAdvice () {
        System.out.println("后置通知：安全...");
    }

    @Around ("execution(* com.lyl.spring6.service..*(..))")
    public void aroundAdvice (ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前环绕：安全...");
        //目标方法
        joinPoint.proceed();
        System.out.println("后环绕：安全...");
    }

    //异常通知
    @AfterThrowing ("execution(* com.lyl.spring6.service..*(..))")
    public void afterThrowingAdvice () {
        System.out.println("异常通知：安全...");
    }

    //最终通知
    @After ("execution(* com.lyl.spring6.service..*(..))")
    public void afterAdvice () {
        System.out.println("最终通知：安全...");
    }
}
