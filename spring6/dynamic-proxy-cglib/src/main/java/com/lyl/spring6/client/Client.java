package com.lyl.spring6.client;

import com.lyl.spring6.service.TimerMethodInterceptor;
import com.lyl.spring6.service.UserService;
import net.sf.cglib.proxy.Enhancer;

/**
 *ClassName: Client
 *Package: com.lyl.spring6.client
 *Description:创建于 2025/6/1 10:58
 *CGLIB动态代理：既可以代理接口，又可以代理类，底层使用代理类继承目标类来实现，效率比JDK代理高
 *虽然继承耦合度高，但是代理类是在内存中动态生成的，父类一边子类也跟着变，不需要程序员维护
 *因此无所谓耦合度高不高
 *注意：因为是继承关系，因此目标类不能使用final修饰
 *@Author lyl
 *@Version 1.0
 */
public class Client {
    public static void main (String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new TimerMethodInterceptor());
        UserService proxy = (UserService) enhancer.create();
        boolean ret = proxy.login("admin" , "123");
        String retValue = ret ? "验证成功" : "验证失败";
        System.out.println(retValue);
        proxy.logout();
    }
}
