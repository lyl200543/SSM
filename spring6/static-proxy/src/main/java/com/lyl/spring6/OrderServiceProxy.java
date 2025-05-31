package com.lyl.spring6;

/**
 *ClassName: OrderServiceProxy
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/31 19:23
 *@Author lyl
 *@Version 1.0
 */
//方法三：使用静态代理（通过实现公共接口的代理类来增强功能）
//优点：符合OCP原则，且代码耦合度较低（关联关系,类中有类/接口）
//缺点：如果有100个接口就得有100个代理类，导致类爆炸
//解决方法：动态代理
public class OrderServiceProxy implements OrderService {
    private OrderService orderService;

    public OrderServiceProxy (OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void generate () {
        long start = System.currentTimeMillis();
        orderService.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));

    }

    @Override
    public void details () {
        long start = System.currentTimeMillis();
        orderService.details();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

    @Override
    public void delete () {
        long start = System.currentTimeMillis();
        orderService.delete();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }
}
