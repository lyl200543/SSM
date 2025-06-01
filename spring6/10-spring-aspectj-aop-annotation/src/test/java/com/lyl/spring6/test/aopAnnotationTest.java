package com.lyl.spring6.test;

import com.lyl.spring6.service.OrderService;
import com.lyl.spring6.service.UserService;
import com.lyl.spring6.service.spring6Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: aopAnnotationTest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/6/1 15:21
 *@Author lyl
 *@Version 1.0
 */
public class aopAnnotationTest {
    @Test
    public void testTotalAnnotation () {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(spring6Config.class);
        UserService userService = applicationContext.getBean("userService" , UserService.class);
        userService.login();
    }

    @Test
    public void testAop () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService" , UserService.class);
        OrderService orderService = applicationContext.getBean("orderService" , OrderService.class);

//        userService.login();
//        userService.logout();

        orderService.generate();
    }
}
