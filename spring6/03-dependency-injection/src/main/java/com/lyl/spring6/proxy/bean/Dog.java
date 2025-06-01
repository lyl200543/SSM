package com.lyl.spring6.proxy.bean;

import java.util.Date;

/**
 *ClassName: dog
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/28 8:57
 *@Author lyl
 *@Version 1.0
 */
public class Dog {
    private String name;
    private int age;
    private Date birth;

    @Override
    public String toString () {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setBirth (Date birth) {
        this.birth = birth;
    }
}
