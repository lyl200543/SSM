package com.lyl.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *ClassName: spring6Config
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/6/1 16:02
 * 全注解式开发
 *@Author lyl
 *@Version 1.0
 */
@Configuration  //代替spring.xml文件
@ComponentScan("com.lyl.spring6.service")
@EnableAspectJAutoProxy   //启用自动代理机制
public class spring6Config {
}
