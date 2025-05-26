package com.lyl.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *ClassName: UserDaoImpl
 *Package: com.lyl.spring6.dao
 *Description:创建于 2025/5/26 13:25
 *@Author lyl
 *@Version 1.0
 */
public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert () {
        logger.info("UserDao操作数据库保存数据...");
    }
}
