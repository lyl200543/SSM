package com.lyl.spring6.bean;

import com.sun.source.doctree.SeeTree;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.*;

/**
 *ClassName: Person
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/27 13:40
 *@Author lyl
 *@Version 1.0
 */
public class Person {
    private List<String> names;
    private Set<String> addrs;
    private Map<Integer, String> phones;
    //Properties继承HashTable类，HashTable又实现了Map接口
    //Properties的key,value只能是String
    private Properties properties;

    @Override
    public String toString () {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                ", phones=" + phones +
                ", properties=" + properties +
                '}';
    }

    public void setNames (List<String> names) {
        this.names = names;
    }

    public void setAddrs (Set<String> addrs) {
        this.addrs = addrs;
    }

    public void setPhones (Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void setProperties (Properties properties) {
        this.properties = properties;
    }
}
