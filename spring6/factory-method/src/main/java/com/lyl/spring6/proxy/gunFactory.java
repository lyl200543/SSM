package com.lyl.spring6.proxy;

/**
 *ClassName: gunFactory
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 13:57
 *@Author lyl
 *@Version 1.0
 */
public class gunFactory extends weaponFactory {
    @Override
    public weapon get () {
        return new gun();
    }
}
