package com.lyl.spring6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *ClassName: component
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/30 20:51
 *@Author lyl
 *@Version 1.0
 */
//修饰注解的注解被称为元注解
@Target (value = {ElementType.TYPE})
//Target注解用来设置Component注解可以出现的位置，以上代表表示Component注解只能用在类和接口上.
@Retention (RetentionPolicy.RUNTIME)
//value属性名可以省略
//Retention注解用来设置Component注解的保持性策略，以上代表Component注解可以被反射机制读取。
public @interface component {
    //注解的属性
    //属性类型为String,属性名为value
    String value();
}
