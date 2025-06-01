package com.lyl.spring6.proxy;

/**
 *ClassName: com.lyl.spring6.proxy.OrderServiceImpl
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/31 19:09
 *@Author lyl
 *@Version 1.0
 */
public class OrderServiceImpl implements OrderService {
    //方法一：直接在源代码修改
    //缺点：不符合OCP原则，代码复用性低
    @Override
    public void generate () {
//        long start = System.currentTimeMillis();
        //模拟延迟
        try {
            Thread.sleep(1314);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正在保存订单信息...");
//        long end = System.currentTimeMillis();
//        System.out.println("耗时：" + (end - start));
    }

    @Override
    public void details () {
//        long start = System.currentTimeMillis();

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单详情如下...");
//        long end = System.currentTimeMillis();
//        System.out.println("耗时：" + (end - start));

    }

    @Override
    public void delete () {
//        long start = System.currentTimeMillis();
        try {
            Thread.sleep(430);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正在删除订单信息...");
//        long end = System.currentTimeMillis();
//        System.out.println("耗时：" + (end - start));

    }
}
