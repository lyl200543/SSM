package com.lyl.spring6.bean;

/**
 *ClassName: myTime
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/28 9:07
 *@Author lyl
 *@Version 1.0
 */
public class myTime {
    private int year;
    private int month;
    private int day;

    @Override
    public String toString () {
        return "myTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public myTime (int year , int month , int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
