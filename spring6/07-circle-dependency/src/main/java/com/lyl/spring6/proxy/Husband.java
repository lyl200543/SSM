package com.lyl.spring6.proxy;

/**
 *ClassName: husband
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 20:03
 *@Author lyl
 *@Version 1.0
 */
public class Husband {
    private String name;
    private Wife wife;

    public void setName (String name) {
        this.name = name;
    }

    public void setWife (Wife wife) {
        this.wife = wife;
    }

    public Husband () {
    }

    public Husband (String name , Wife wife) {
        this.name = name;
        this.wife = wife;
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString () {
        return "Husband{" + "name='" + name + '\'' + ", wife=" + wife.getName() + '}';
    }
}
