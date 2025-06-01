package com.lyl.spring6.service;

import org.springframework.stereotype.Service;

/**
 *ClassName: UserService
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/6/1 15:11
 *@Author lyl
 *@Version 1.0
 */
@Service
public class UserService {
    public void login () {
        System.out.println("系统正在进行身份验证...");
    }

    public void logout () {
        System.out.println("系统正在退出...");
    }
}
