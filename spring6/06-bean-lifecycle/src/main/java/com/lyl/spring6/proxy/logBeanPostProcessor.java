package com.lyl.spring6.proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *ClassName: logBeanPostProcessor
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 17:08
 *@Author lyl
 *@Version 1.0
 */
public class logBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization (Object bean , String beanName) throws BeansException {
        System.out.println("第三步：Bean后处理器的before方法执行");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean , beanName);
    }

    @Override
    public Object postProcessAfterInitialization (Object bean , String beanName) throws BeansException {
        System.out.println("第五步：Bean后处理器的after方法执行");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean , beanName);
    }
}
