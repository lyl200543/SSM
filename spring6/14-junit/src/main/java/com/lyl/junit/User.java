package com.lyl.junit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *ClassName: User
 *Package: com.lyl.junit
 *Description:创建于 2025/6/2 17:14
 *@Author lyl
 *@Version 1.0
 */
@Component
public class User {
    @Value ("张三")
    private String name;

    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User () {
    }

    public User (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
