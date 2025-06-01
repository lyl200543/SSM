package com.lyl.spring6.proxy.test;

import com.lyl.spring6.proxy.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 *ClassName: becomeBeanTest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/5/29 17:27
 *@Author lyl
 *@Version 1.0
 */
public class becomeBeanTest {
    @Test
    public void test () {
        User user = new User();
        System.out.println(user);

//        将user纳入spring管理
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("userBean" , user);
        User userBean = factory.getBean("userBean" , User.class);
        System.out.println(userBean);
    }
}
