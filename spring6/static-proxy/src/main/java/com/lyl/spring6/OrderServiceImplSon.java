package com.lyl.spring6;

/**
 *ClassName: OrderServiceImplSon
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/31 19:18
 *@Author lyl
 *@Version 1.0
 */
//方法二：在目标对象的子类上增强功能
//优点：符合OCP原则
//缺点：泛化关系（继承关系），耦合度高
public class OrderServiceImplSon extends OrderServiceImpl {
    @Override
    public void generate () {
        long start = System.currentTimeMillis();
        super.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

    @Override
    public void details () {
        long start = System.currentTimeMillis();
        super.details();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

    @Override
    public void delete () {
        long start = System.currentTimeMillis();
        super.delete();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }
}
