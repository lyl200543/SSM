package com.lyl.spring6.proxy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *ClassName: dateFactory
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 15:41
 *@Author lyl
 *@Version 1.0
 */
public class dateFactory implements FactoryBean<Date> {
    private String strdate;

    public dateFactory (String strdate) {
        this.strdate = strdate;
    }

    @Override
    public Date getObject () throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strdate);
        return date;
    }

    @Override
    public Class<?> getObjectType () {
        return null;
    }
}
