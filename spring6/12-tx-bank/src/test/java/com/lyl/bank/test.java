package com.lyl.bank;

import com.lyl.bank.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: test
 *Package: com.lyl.bank
 *Description:创建于 2025/6/1 19:58
 *@Author lyl
 *@Version 1.0
 */
public class test {
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
