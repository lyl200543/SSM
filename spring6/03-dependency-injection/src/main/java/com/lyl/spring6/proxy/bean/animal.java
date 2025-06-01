package com.lyl.spring6.proxy.bean;

/**
 *ClassName: animal
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/27 14:01
 *@Author lyl
 *@Version 1.0
 */
public class animal {
    private String name;
    private int age;

    public String getName () {
        return name;
    }

    @Override
    public String toString () {
        return "animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }
}
