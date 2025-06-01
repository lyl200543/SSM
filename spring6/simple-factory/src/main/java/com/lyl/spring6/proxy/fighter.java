package com.lyl.spring6.proxy;

/**
 *ClassName: fighter
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 13:33
 * 具体产品角色
 *@Author lyl
 *@Version 1.0
 */
public class fighter extends weapon {
    @Override
    public void attack () {
        System.out.println("战斗机开始扫射!!!");
    }
}
