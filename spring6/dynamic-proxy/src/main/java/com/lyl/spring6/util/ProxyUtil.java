package com.lyl.spring6.util;

import com.lyl.spring6.proxy.OrderService;
import com.lyl.spring6.proxy.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 *ClassName: ProxyUtil
 *Package: com.lyl.spring6.util
 *Description:创建于 2025/6/1 10:49
 *@Author lyl
 *@Version 1.0
 */
public class ProxyUtil {
    public static Object newProxyInstance (Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader() ,
                target.getClass().getInterfaces() ,
                new TimerInvocationHandler(target));

    }
}
