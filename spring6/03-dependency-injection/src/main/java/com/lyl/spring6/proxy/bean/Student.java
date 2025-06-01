package com.lyl.spring6.proxy.bean;

/**
 *ClassName: Student
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/26 20:21
 *@Author lyl
 *@Version 1.0
 */
public class Student {
    private String name;
    private Clazz clazz;

    //要给级联属性赋值必须有getter方法
    public Clazz getClazz () {
        return clazz;
    }

//    @Override
//    public String toString () {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", clazz=" + clazz +
//                '}';
//    }


    public void setClazz (Clazz clazz) {
        this.clazz = clazz;
    }

    public void setName (String name) {
        this.name = name;
    }
}
