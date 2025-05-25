package com.lyl.spring6.web;

import com.lyl.spring6.service.UserService;
import com.lyl.spring6.service.impl.UserServiceImpl;

/**
 *ClassName: UserWeb
 *Package: com.lyl.spring6.web
 *Description:创建于 2025/5/25 16:34
 *@Author lyl
 *@Version 1.0
 */
public class UserController {
    private UserService userService = new UserServiceImpl();

    public void deleteAction () {
        userService.deleteUser();
    }
}
