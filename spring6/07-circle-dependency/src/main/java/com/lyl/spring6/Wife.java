package com.lyl.spring6;

/**
 *ClassName: Wife
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 20:04
 *@Author lyl
 *@Version 1.0
 */
public class Wife {
    private String name;
    private Husband husband ;

    public void setName (String name) {
        this.name = name;
    }

    public void setHusband (Husband husband) {
        this.husband = husband;
    }

    public Wife () {
    }

    public Wife (String name , Husband husband) {
        this.name = name;
        this.husband = husband;
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString () {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }
}
