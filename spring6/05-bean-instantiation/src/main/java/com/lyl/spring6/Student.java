package com.lyl.spring6;

import java.util.Date;

/**
 *ClassName: Student
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 15:37
 *@Author lyl
 *@Version 1.0
 */
public class Student {
    private Date birth;

    public void setBirth (Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString () {
        return "Student{" +
                "birth=" + birth +
                '}';
    }
}
