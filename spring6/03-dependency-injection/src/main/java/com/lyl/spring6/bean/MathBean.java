package com.lyl.spring6.bean;

/**
 *ClassName: MathBean
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/27 14:11
 *@Author lyl
 *@Version 1.0
 */
public class MathBean {
    private String sign;

    @Override
    public String toString () {
        return "MathBean{" +
                "sign='" + sign + '\'' +
                '}';
    }

    public void setSign (String sign) {
        this.sign = sign;
    }
}
