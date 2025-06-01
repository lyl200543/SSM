package com.lyl.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *ClassName: LogAspect
 *Package: com.lyl.spring6.biz
 *Description:创建于 2025/6/1 16:46
 *@Author lyl
 *@Version 1.0
 */
@Component
@Aspect
public class LogAspect {
    @Pointcut ("execution(* com.lyl.spring6.biz..insert*(..))")
    public void insert () {
    }

    @Pointcut ("execution(* com.lyl.spring6.biz..delete*(..))")
    public void delete () {
    }

    @Pointcut ("execution(* com.lyl.spring6.biz..update*(..))")
    public void update () {
    }

    @Before ("insert() || delete() || update()")
    public void log (JoinPoint joinPoint) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        String date = sdf.format(new Date());
        String info = date + " 张三：" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        System.out.println(info);
    }

}
