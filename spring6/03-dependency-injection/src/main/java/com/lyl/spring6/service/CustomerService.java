package com.lyl.spring6.service;

import com.lyl.spring6.dao.UserDao;
import com.lyl.spring6.dao.VipDao;

/**
 *ClassName: CustomerService
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/5/26 16:20
 * 构造注入
 *@Author lyl
 *@Version 1.0
 */
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;

    public CustomerService (UserDao userDao , VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void sava () {
        userDao.insert();
        vipDao.insert();
    }
}
