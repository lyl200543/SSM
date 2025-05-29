package com.lyl.spring6;

/**
 *ClassName: daggerFactory
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 13:57
 *@Author lyl
 *@Version 1.0
 */
public class daggerFactory extends weaponFactory{
    @Override
    public weapon get () {
        return new dagger();
    }
}
