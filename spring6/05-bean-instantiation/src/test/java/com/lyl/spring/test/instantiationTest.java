package com.lyl.spring.test;

import com.lyl.spring6.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: instantiationTest
 *Package: com.lyl.spring.test
 *Description:创建于 2025/5/29 14:44
 *@Author lyl
 *@Version 1.0
 */
public class instantiationTest {
    @Test
    public void testDate () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student sb = applicationContext.getBean("sb" , Student.class);
        System.out.println(sb);
    }

    @Test
    public void testInstantiation4 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person personBean = applicationContext.getBean("personBean" , Person.class);
        System.out.println(personBean);
    }

    @Test
    public void testInstantiation3 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Gun gunBean = applicationContext.getBean("gunBean" , Gun.class);
        System.out.println(gunBean);
    }

    @Test
    public void testInstantiation2 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Star starBean = applicationContext.getBean("starBean" , Star.class);
        System.out.println(starBean);
    }

    @Test
    public void testInstantiation1 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        springBean springBean = applicationContext.getBean("springBean" , springBean.class);
        System.out.println(springBean);
    }
}
