package com.lyl.spring6.service;

/**
 *ClassName: UserService
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/6/1 10:57
 *@Author lyl
 *@Version 1.0
 */
public class UserService {
    public boolean login (String username , String password) {
        System.out.println("正在验证身份...");
        if ("admin".equals(username) && "123".equals(password)) {
            return true;
        }
        return false;
    }

    public void logout () {
        System.out.println("正在退出...");
    }
}
