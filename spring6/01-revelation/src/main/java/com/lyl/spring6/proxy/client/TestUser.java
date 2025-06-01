package com.lyl.spring6.proxy.client;

import com.lyl.spring6.proxy.web.UserController;
import org.junit.Test;

/**
 *ClassName: Test
 *Package: com.lyl.spring6.client
 *Description:创建于 2025/5/25 16:49
 *@Author lyl
 *@Version 1.0
 */
public class TestUser {
    @Test
    public void testDeleteUser () {
        UserController userController = new UserController();
        userController.deleteAction();
    }
}
