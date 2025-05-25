package com.lyl.spring6.dao.impl;

import com.lyl.spring6.dao.UserDao;

/**
 *ClassName: UserDaoImplForOracle
 *Package: com.lyl.spring6.dao.impl
 *Description:创建于 2025/5/25 16:53
 *@Author lyl
 *@Version 1.0
 */
public class UserDaoImplForOracle implements UserDao {
    @Override
    public void deleteById () {
        System.out.println("Oracle数据库正在删除数据...");
    }
}
