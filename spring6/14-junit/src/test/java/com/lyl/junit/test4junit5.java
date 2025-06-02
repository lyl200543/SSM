package com.lyl.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *ClassName: test4junit5
 *Package: com.lyl.junit
 *Description:创建于 2025/6/2 17:23
 *@Author lyl
 *@Version 1.0
 */
@ExtendWith (SpringExtension.class)
@ContextConfiguration ("classpath:spring.xml")
public class test4junit5 {
    @Autowired
    private User user;

    @Test
    public void test1 () {
        System.out.println(user);
    }
}
