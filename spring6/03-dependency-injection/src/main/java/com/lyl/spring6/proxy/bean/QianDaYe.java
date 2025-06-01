package com.lyl.spring6.proxy.bean;

import java.util.Arrays;

/**
 *ClassName: QianDaYe
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/27 13:20
 *@Author lyl
 *@Version 1.0
 */
public class QianDaYe {
    private String[] hobbies;
    private Woman[] women;

    @Override
    public String toString () {
        return "QianDaYe{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", women=" + Arrays.toString(women) +
                '}';
    }

    public void setWomen (Woman[] women) {
        this.women = women;
    }

    public void setHobbies (String[] hobbies) {
        this.hobbies = hobbies;
    }
}
