package com.lyl.spring6.service;

import com.lyl.spring6.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *ClassName: UserService
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/5/26 13:26
 * set注入
 *@Author lyl
 *@Version 1.0
 */
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private UserDao userDao;

    public void setUserDao (UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser () {
        logger.info("业务层正在保存数据...");
        userDao.insert();
    }

}
