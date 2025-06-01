package com.lyl.spring6.proxy.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *ClassName: VipDao
 *Package: com.lyl.spring6.dao
 *Description:创建于 2025/5/26 16:18
 *@Author lyl
 *@Version 1.0
 */
public class VipDao {
    private static final Logger logger = LoggerFactory.getLogger(VipDao.class);

    public void insert () {
        logger.info("VipDao操作数据库保存数据...");
    }
}
