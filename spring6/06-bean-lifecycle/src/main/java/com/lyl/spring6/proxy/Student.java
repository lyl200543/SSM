package com.lyl.spring6.proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *ClassName: Student
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 16:52
 *@Author lyl
 *@Version 1.0
 */
public class Student implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware,
        InitializingBean, DisposableBean {
    private String name;

    public Student () {
        System.out.println("第一步：实例化Bean");
    }

    public void setName (String name) {
        System.out.println("第二步：Bean属性赋值");
        this.name = name;
    }

    public void stuinit () {
        System.out.println("第四步：初始化Bean");
    }

    public void studestroy () {
        System.out.println("第七步：销毁Bean");
    }


    @Override
    public void setBeanClassLoader (ClassLoader classLoader) {
        System.out.println("该对象的类加载器是：" + classLoader);
    }

    @Override
    public void setBeanFactory (BeanFactory beanFactory) throws BeansException {
        System.out.println("该对象的BeanFactory是：" + beanFactory);
    }

    @Override
    public void setBeanName (String name) {
        System.out.println("该对象的名字是：" + name);
    }

    @Override
    public void afterPropertiesSet () throws Exception {
        System.out.println("实现了InitailizingBean接口");
    }

    @Override
    public void destroy () throws Exception {
        System.out.println("实现了DisposableBean接口");
    }
}
