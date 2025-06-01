package com.lyl.spring6.proxy.service;

import com.lyl.spring6.proxy.dao.OrderDao;

/**
 *ClassName: OrderService
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/5/26 16:45
 *@Author lyl
 *@Version 1.0
 */
public class OrderService {
    private OrderDao orderDao;

    public void setAaa (OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate () {
        orderDao.insert();
    }
}
