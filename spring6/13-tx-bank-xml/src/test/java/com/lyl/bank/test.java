package com.lyl.bank;

import com.lyl.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: test
 *Package: com.lyl.bank
 *Description:创建于 2025/6/2 15:22
 *@Author lyl
 *@Version 1.0
 */
public class test {
    @Test
    public void testXML () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService" , AccountService.class);
        try {
            accountService.transfer("act-001" , "act-002" , 10000);
            System.out.println("转账成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
