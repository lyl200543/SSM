package com.lyl.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *ClassName: TransactionAspect
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/6/1 16:32
 *@Author lyl
 *@Version 1.0
 */
@Component
@Aspect
public class TransactionAspect {
    @Around ("execution(* com.lyl.spring6.service..*(..))")
    public void aroundAdvice (ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("开启事务");
            joinPoint.proceed();
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");
        }
    }
}
