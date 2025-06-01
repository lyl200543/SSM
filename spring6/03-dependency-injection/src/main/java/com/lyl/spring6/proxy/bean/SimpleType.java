package com.lyl.spring6.proxy.bean;

import java.util.Date;

/**
 *ClassName: SimpleType
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/26 19:41
 *@Author lyl
 *@Version 1.0
 */
public class SimpleType {
    private int num;
    private Integer num2;
    private char c;
    private Character c2;
    private boolean flag;
    private Boolean flag2;
    private Seasons season;
    private Class clazz;
    private Date date;

    public static void main (String[] args) {
        System.out.println(new Date());
    }

    @Override
    public String toString () {
        return "SimpleType{" +
                "num=" + num +
                ", num2=" + num2 +
                ", c=" + c +
                ", c2=" + c2 +
                ", flag=" + flag +
                ", flag2=" + flag2 +
                ", season=" + season +
                ", clazz=" + clazz +
                ", date=" + date +
                '}';
    }

    public void setDate (Date date) {
        this.date = date;
    }

    public void setNum (int num) {
        this.num = num;
    }

    public void setNum2 (Integer num2) {
        this.num2 = num2;
    }

    public void setC (char c) {
        this.c = c;
    }

    public void setC2 (Character c2) {
        this.c2 = c2;
    }

    public void setFlag (boolean flag) {
        this.flag = flag;
    }

    public void setFlag2 (Boolean flag2) {
        this.flag2 = flag2;
    }

    public void setSeason (Seasons season) {
        this.season = season;
    }

    public void setClazz (Class clazz) {
        this.clazz = clazz;
    }
}
