package com.lyl.spring6.bean;

/**
 *ClassName: User
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/26 16:57
 *@Author lyl
 *@Version 1.0
 */
public class User {
    private String name;
    private String password;
    private int age;

    public void setName (String name) {
        this.name = name;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public void setAge (int age) {
        this.age = age;
    }

    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
