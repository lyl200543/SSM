package com.lyl.spring6.dao.impl;

import com.lyl.spring6.dao.UserDao;

/**
 *ClassName: UserDaoImplForMySQL
 *Package: com.lyl.spring6.dao.impl
 *Description:创建于 2025/5/25 16:35
 *@Author lyl
 *@Version 1.0
 */
public class UserDaoImplForMySQL implements UserDao {
    @Override
    public void deleteById () {
        System.out.println("MySQL数据库正在删除对象...");
    }
}
