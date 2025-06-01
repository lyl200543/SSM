package com.lyl.spring6.service;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *ClassName: TimerMethodInterceptor
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/6/1 11:17
 *@Author lyl
 *@Version 1.0
 */
public class TimerMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept (Object o , Method method , Object[] objects , MethodProxy methodProxy) throws Throwable {
        long start = System.currentTimeMillis();
        Object retValue = methodProxy.invokeSuper(o , objects);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
        return retValue;
    }
}
