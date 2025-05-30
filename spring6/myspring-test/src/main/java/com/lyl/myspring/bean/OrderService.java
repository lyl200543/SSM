package com.lyl.myspring.bean;

/**
 *ClassName: OrderService
 *Package: com.lyl.myspring.bean
 *Description:创建于 2025/5/30 19:46
 *@Author lyl
 *@Version 1.0
 */
public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao (OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void save () {
        orderDao.insert();
    }
}
