package com.lyl.spring6.test;

import com.lyl.spring6.biz.UserService;
import com.lyl.spring6.biz.VipService;
import com.lyl.spring6.biz.spirng6Config2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *ClassName: LogTest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/6/1 16:57
 *@Author lyl
 *@Version 1.0
 */
public class LogTest {
    @Test
    public void testLog () {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(spirng6Config2.class);
        UserService userService = applicationContext.getBean("userService" , UserService.class);
        userService.insertUser();
        userService.deleteUser();
        userService.updateUser();
        userService.selectUser();

        VipService vipService = applicationContext.getBean("vipService" , VipService.class);
        vipService.insertVip();
        vipService.deleteVip();
        vipService.updateVip();
        vipService.selectVip();
    }
}
