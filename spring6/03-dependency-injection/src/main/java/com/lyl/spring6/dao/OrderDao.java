package com.lyl.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *ClassName: OrderDao
 *Package: com.lyl.spring6.dao
 *Description:创建于 2025/5/26 16:42
 *@Author lyl
 *@Version 1.0
 */
public class OrderDao {
    private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);

    public void insert () {
        logger.info("订单正在生成...");
    }
}
