package com.lyl.spring6.test;

import com.lyl.spring6.bean.User;
import com.lyl.spring6.dao.UserDaoImplForMySQL;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *ClassName: firstSpringTest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/5/26 10:45
 *@Author lyl
 *@Version 1.0
 */
public class firstSpringTest {
    @Test
    public void testLog4j2 () {
        Logger logger = LoggerFactory.getLogger(firstSpringTest.class);
        logger.debug("我是一条debug信息");
        logger.error("我是一条error信息");
        logger.warn("我是一条warn信息");
    }

    @Test
    public void testBeanFactory () {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = beanFactory.getBean("UserBean" , User.class);
        System.out.println(userBean);
    }

    @Test
    public void testBean () {
        // 第一步:获取Spring容器对象。
        // ApplicationContext 翻译为:应用上下文。其实就是Spring容器
        // ApplicationContext 是一个接口。
        // ApplicationContext 接口下有很多实现类。其中有一个实现类叫做:ClassPathXmlApplicationcontext
        // classPathXmlApplicationcontext 专门从类路径当中加载spring配置文件的一个Spring上下文对象。
        // 这行代码只要执行:就相当于启动了Spring容器，解析spring.xml文件，并且实例化所有的bean对象，放到spring容器当中。
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.xml" , "beans.xml" , "xml/bean.xml");
        // 第二步:根据bean的id从Spring容器中获取这个对象。
        Object userBean = applicationContext.getBean("UserBean");
        System.out.println(userBean);

        UserDaoImplForMySQL userDaoBean = applicationContext.getBean("UserDaoBean" , UserDaoImplForMySQL.class);
        userDaoBean.insert();
        System.out.println(userDaoBean);

        Object vipBean = applicationContext.getBean("VipBean");
        System.out.println(vipBean);

        Object userBean2 = applicationContext.getBean("UserBean2");
        System.out.println(userBean2);

        Date nowTime = applicationContext.getBean("nowTime" , Date.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(nowTime);
        System.out.println(format);

    }
}
