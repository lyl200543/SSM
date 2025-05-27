package com.lyl.spring6.test;

import com.lyl.spring6.bean.*;
import com.lyl.spring6.service.CustomerService;
import com.lyl.spring6.service.OrderService;
import com.lyl.spring6.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: DITest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/5/26 13:31
 *@Author lyl
 *@Version 1.0
 */
public class DITest {
    @Test
    public void testSign () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MathBean mathBean = applicationContext.getBean("MathBean" , MathBean.class);
        System.out.println(mathBean);
    }

    @Test
    public void testNull () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        animal animalBean = applicationContext.getBean("animalBean" , animal.class);
        System.out.println(animalBean.getName().toUpperCase());
    }

    @Test
    public void testCollection () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-collection.xml");
        Person personBean = applicationContext.getBean("PersonBean" , Person.class);
        System.out.println(personBean);
    }

    @Test
    public void testArray () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-array.xml");
        QianDaYe qianDaYeBean = applicationContext.getBean("QianDaYeBean" , QianDaYe.class);
        System.out.println(qianDaYeBean);
    }

    @Test
    public void testCascade () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student studentBean = applicationContext.getBean("StudentBean" , Student.class);
        System.out.println(studentBean);
        System.out.println(studentBean.getClazz());
        Clazz clazzBean = applicationContext.getBean("ClazzBean" , Clazz.class);
        System.out.println(clazzBean);
    }

    @Test
    public void testDataSource () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        myDataSource myDataSourceBean = applicationContext.getBean("myDataSourceBean" , myDataSource.class);
        System.out.println(myDataSourceBean);
    }

    @Test
    public void testSimpleType () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
//        User userBean = applicationContext.getBean("UserBean" , User.class);
//        System.out.println(userBean);

        SimpleType simpleTypeBean = applicationContext.getBean("SimpleTypeBean" , SimpleType.class);
        System.out.println(simpleTypeBean);
    }

    @Test
    public void testSetDI () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderServiceBean = applicationContext.getBean("OrderServiceBean" , OrderService.class);
        orderServiceBean.generate();
        OrderService orderServiceBean2 = applicationContext.getBean("OrderServiceBean2" , OrderService.class);
        orderServiceBean2.generate();
    }

    @Test
    public void testConstructor () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService csBean = applicationContext.getBean("csBean" , CustomerService.class);
        csBean.sava();

        CustomerService csBean2 = applicationContext.getBean("csBean2" , CustomerService.class);
        csBean2.sava();
    }

    @Test
    public void testSet () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("UserServiceBean" , UserService.class);
        userServiceBean.saveUser();
    }
}
