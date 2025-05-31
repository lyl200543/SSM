package com.lyl.spring6;

/**
 *ClassName: proxyTest
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/31 19:13
 *项目已上线，并且运行正常，只是客户反馈系统有一些地方运行较慢，要求项目组对系统进行优化
 *于是项目负责人就下达了这个需求。首先需要搞清楚是哪些业务方法耗时较长
 *于是让我们统计每个业务方法所耗费的时长。如果是你，你该怎么做呢?
 *@Author lyl
 *@Version 1.0
 */
public class proxyTest {
    public static void main (String[] args) {
//        OrderService orderService = new OrderServiceImplSon();
//        orderService.generate();
//        orderService.details();
//        orderService.delete();

        OrderService target = new OrderServiceImpl();
        OrderService proxy = new OrderServiceProxy(target);
        proxy.generate();
        proxy.details();
        proxy.delete();
    }
}
