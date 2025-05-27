package com.lyl.spring6.bean;

/**
 *ClassName: Woman
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/27 13:27
 *@Author lyl
 *@Version 1.0
 */
public class Woman {
    private String name;

    @Override
    public String toString () {
        return "Woman{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName (String name) {
        this.name = name;
    }
}
