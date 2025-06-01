package com.lyl.spring6.client;

import com.lyl.spring6.proxy.OrderService;
import com.lyl.spring6.proxy.OrderServiceImpl;
import com.lyl.spring6.proxy.TimerInvocationHandler;
import com.lyl.spring6.util.ProxyUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *ClassName: Client
 *Package: com.lyl.spring6.client
 *Description:创建于 2025/6/1 10:06
 *jdk动态代理：只能代理接口，方式是代理类中含有接口
 *@Author lyl
 *@Version 1.0
 */
public class Client {
    public static void main (String[] args) {
        OrderService target = new OrderServiceImpl();
        //这行代码做了两件事
        //第一件事:在内存中生成了代理类的字节码
        //第二件事:创建代理对象
        //Proxy类全名:java.lang.refect.Proxy。这是JDK提供的一个类(所以称为JDK动态代理)
        //主要是通过这个类在内存中生成代理类的字节码
        //其中newProxyInstance()方法有三个参数:
        //第一个参数:类加载器。在内存中生成了字节码，要想执行这个字节码
        //也是需要先把这个字节码加载到内存当中的,所以要指定使用哪个类加载器加载
        //第二个参数:接口类型。代理类和目标类实现相同的接口
        //所以要通过这个参数告诉JDK动态代理生成的类要实现哪些接口
        //第三个参数:调用处理器。这是一个JDK动态代理规定的接口
        //接口全名:java.lanq.refect.invocationHandler，显然这是一个回调接口
        //也就是说调用这个接口中方法的程序已经写好了，就差这个接口的实现类了
        OrderService proxy = (OrderService) ProxyUtil.newProxyInstance(target);
        proxy.generate();
        proxy.details();
        proxy.delete();

    }
}
