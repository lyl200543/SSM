package com.lyl.spring6.test;

import com.lyl.spring6.Husband;
import com.lyl.spring6.Wife;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: CDTest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/5/29 20:10
 *@Author lyl
 *@Version 1.0
 */
public class CDTest {
    @Test
    public void test1 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Husband husband = applicationContext.getBean("husband" , Husband.class);
        System.out.println(husband);
        Wife wife = applicationContext.getBean("wife" , Wife.class);
        System.out.println(wife);
    }
}
