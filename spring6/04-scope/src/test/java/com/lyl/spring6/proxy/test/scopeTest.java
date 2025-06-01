package com.lyl.spring6.proxy.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: scopeTest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/5/28 18:43
 *@Author lyl
 *@Version 1.0
 */
public class scopeTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("springBean.xml");
//        springBean sb = applicationContext.getBean("sb" , springBean.class);
//        System.out.println(sb);
//
//        springBean sb1 = applicationContext.getBean("sb" , springBean.class);
//        System.out.println(sb1);
//
//        springBean sb2 = applicationContext.getBean("sb" , springBean.class);
//        System.out.println(sb2);
    }
}
