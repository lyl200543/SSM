package com.lyl.myspring.bean;

/**
 *ClassName: Vip
 *Package: com.lyl.myspring.bean
 *Description:创建于 2025/5/30 19:44
 *@Author lyl
 *@Version 1.0
 */
public class Vip {
    private String name;
    private int age;
    private char sex;
    private boolean isMarried;

    @Override
    public String toString () {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", isMarried=" + isMarried +
                '}';
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setSex (char sex) {
        this.sex = sex;
    }

    public void setIsMarried (boolean married) {
        isMarried = married;
    }
}
