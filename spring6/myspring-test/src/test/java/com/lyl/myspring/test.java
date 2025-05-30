package com.lyl.myspring;

import com.lyl.myspring.bean.OrderService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 *ClassName: test
 *Package: com.lyl.myspring
 *Description:创建于 2025/5/30 19:50
 *@Author lyl
 *@Version 1.0
 */
public class test {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
        Object vipBean = applicationContext.getBean("vipBean");
        System.out.println(vipBean );

        Object orderServiceBean = applicationContext.getBean("orderServiceBean");
        OrderService serviceBean = (OrderService) orderServiceBean;
        serviceBean.save();
    }
}
