package com.lyl.spring6.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *ClassName: LogAspect
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/6/1 15:15
 *@Author lyl
 *@Version 1.0
 */
@Component
@Aspect
@Order (0)  //指定切面的执行顺序
public class LogAspect {
    //切面=通知+切点
    //通知本质上是一段增强代码，代码必须写在方法中
    //通知分为：前置，后置，环绕，异常，最终
    //切点表达式：execution([访问控制权限修饰符]返回值类型[全限定类名]方法名(形式参数列表)[异常])
    //表示通知作用的方法

//    @Before("execution(* com.lyl.spring6.service..*(..))")
//    public void log () {
//        System.out.println("这是一段增强代码");
//    }


    //通用切点表达式：
    @Pointcut ("execution(* com.lyl.spring6.service..*(..))")
    public void general () {
        //只是一个标记，不用写代码
    }

    //前置通知
    @Before ("general()")
    public void beforeAdvice (JoinPoint joinPoint) {
        System.out.println("前置通知");
        //JoinPoint joinPoint，在Spring容器调用这个方法的时候自动传过来
        //我们可以直接用。用这个JoinPoint joinPoint干啥?
        //Signature signature = joinPoint.getsignature();
        //获取目标方法的签名，通过方法的签名可以获取到一个方法的具体信息。
        //获取目标方法的方法名。
        System.out.println("该方法名为：" + joinPoint.getSignature().getName());
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());

    }

    //后置通知
    @AfterReturning ("general()")
    public void afterReturningAdvice () {
        System.out.println("后置通知");
    }

    //环绕通知
    //ProceedingJoinPoint是JoinPoint的子类
    @Around ("general()")
    public void aroundAdvice (ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前环绕");
        //目标方法
        joinPoint.proceed();
        System.out.println("后环绕");
    }

    //异常通知
    @AfterThrowing ("general()")
    public void afterThrowingAdvice () {
        System.out.println("异常通知");
    }

    //最终通知
    @After ("general()")
    public void afterAdvice () {
        System.out.println("最终通知");
    }
}
