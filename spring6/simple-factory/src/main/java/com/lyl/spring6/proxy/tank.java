package com.lyl.spring6.proxy;

/**
 *ClassName: tank
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 13:32
 * 具体产品角色
 *@Author lyl
 *@Version 1.0
 */
public class tank extends weapon {
    @Override
    public void attack () {
        System.out.println("坦克开始轰炸!!!");
    }
}
