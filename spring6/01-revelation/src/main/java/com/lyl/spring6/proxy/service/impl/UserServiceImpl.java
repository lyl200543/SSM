package com.lyl.spring6.proxy.service.impl;

import com.lyl.spring6.proxy.dao.UserDao;
import com.lyl.spring6.proxy.dao.impl.UserDaoImplForOracle;
import com.lyl.spring6.proxy.service.UserService;

/**
 *ClassName: UserServiceImpl
 *Package: com.lyl.spring6.service.impl
 *Description:创建于 2025/5/25 16:46
 *@Author lyl
 *@Version 1.0
 */
public class UserServiceImpl implements UserService {
    //    private UserDao userDao = new UserDaoImplForMySQL();
    private UserDao userDao = new UserDaoImplForOracle();

    @Override
    public void deleteUser () {
        userDao.deleteById();
    }
}
