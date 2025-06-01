package com.lyl.spring6.proxy;

/**
 *ClassName: gun
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 13:55
 *@Author lyl
 *@Version 1.0
 */
public class gun extends weapon {
    @Override
    public void attack () {
        System.out.println("开枪！！！");
    }
}
