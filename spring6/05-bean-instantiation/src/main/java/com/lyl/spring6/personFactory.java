package com.lyl.spring6;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

/**
 *ClassName: personFactory
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 15:11
 *@Author lyl
 *@Version 1.0
 */
public class personFactory implements FactoryBean<Person> {
    @Override
    public Person getObject () throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType () {
        return null;
    }

    //设置是否是单例
    @Override
    public boolean isSingleton () {
        return false;
    }
}
