package com.lyl.spring6.proxy;

/**
 *ClassName: annotationTest
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/30 20:59
 *@Author lyl
 *@Version 1.0
 */
public class annotationTest {
    public static void main (String[] args) {
        try {
            Class<?> clazz = Class.forName("com.lyl.spring6.proxy.bean.User");
            if (clazz.isAnnotationPresent(component.class)) {
                component annotation = clazz.getAnnotation(component.class);
                System.out.println(annotation.value());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
