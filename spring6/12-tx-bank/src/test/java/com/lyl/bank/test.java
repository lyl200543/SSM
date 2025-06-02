package com.lyl.bank;

import com.lyl.bank.pojo.Account;
import com.lyl.bank.service.AccountService;
import com.lyl.bank.service.IsolationService1;
import com.lyl.bank.service.IsolationService2;
import com.lyl.bank.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *ClassName: test
 *Package: com.lyl.bank
 *Description:创建于 2025/6/1 19:58
 *@Author lyl
 *@Version 1.0
 */
public class test {
    @Test
    public void testNoXML () {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(spring6Config.class);
        AccountService accountService = applicationContext.getBean("accountService" , AccountService.class);
        try {
            accountService.transfer("act-001" , "act-002" , 10000.0);
            System.out.println("转账成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIsolation2 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService2 i2 = applicationContext.getBean("i2" , IsolationService2.class);
        i2.insert(new Account("act-003" , 10000));
    }

    @Test
    public void testIsolation1 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService1 i1 = applicationContext.getBean("i1" , IsolationService1.class);
//        i1.getByActno("act-003");
        i1.getByActno("act-001");
    }

    @Test
    public void testPropagation () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService" , AccountService.class);
        accountService.save(new Account("act-003" , 10000));
    }

    @Test
    public void testTX () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountServiceImpl accountService = applicationContext.getBean("accountService" , AccountServiceImpl.class);
        try {
            accountService.transfer("act-001" , "act-002" , 10000.0);
            System.out.println("转账成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
