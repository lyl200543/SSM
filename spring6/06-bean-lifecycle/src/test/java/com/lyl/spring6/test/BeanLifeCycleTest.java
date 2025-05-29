package com.lyl.spring6.test;

import com.lyl.spring6.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: BeanLifeCycleTest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/5/29 16:57
 *@Author lyl
 *@Version 1.0
 */
public class BeanLifeCycleTest {
    @Test
    public void testLifeCycle5 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = applicationContext.getBean("student" , Student.class);
        System.out.println("第六步：使用Bean: " + student);

        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();

    }
}
