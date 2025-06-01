package com.lyl.spring6.test;

import com.lyl.spring6.service.AccountService;
import com.lyl.spring6.service.spring6Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: TransactionTest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/6/1 16:36
 *@Author lyl
 *@Version 1.0
 */
public class TransactionTest {
    @Test
    public void testTransaction () {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(spring6Config.class);
        AccountService accountService = applicationContext.getBean("accountService" , AccountService.class);
        accountService.thransfer();
        accountService.withdraw();
    }
}
