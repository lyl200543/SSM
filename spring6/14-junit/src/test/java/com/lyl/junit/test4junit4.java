package com.lyl.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *ClassName: test
 *Package: com.lyl.junit
 *Description:创建于 2025/6/2 17:18
 *@Author lyl
 *@Version 1.0
 */
@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration ("classpath:spring.xml")
public class test4junit4 {
    @Autowired
    private User user;

    @Test
    public void test1 () {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        User user = applicationContext.getBean("user" , User.class);
//        System.out.println(user);

        System.out.println(user);
    }
}
