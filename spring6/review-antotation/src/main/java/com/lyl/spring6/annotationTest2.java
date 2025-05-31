package com.lyl.spring6;

import java.io.File;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *ClassName: annotationTest2
 *Package: com.lyl.spring6.bean
 *Description:创建于 2025/5/31 8:48
 *@Author lyl
 *@Version 1.0
 */
public class annotationTest2 {
    public static void main (String[] args) {
        Map<String, Object> beans = new HashMap<>();
        //目前只知道一个包的名字，扫描这个包下所有的类，当这个类上有@component注解的时候，实例化该对象，然后放到Map集合中。
        String packageName = "com.lyl.spring6.bean";
        String path = packageName.replaceAll("\\." , "/");
//        System.out.println(path);
        URL url = ClassLoader.getSystemClassLoader().getResource(path);
//        System.out.println(url.getPath());
        File file = new File(url.getPath());
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
            try {
//            System.out.println(f.getName());
//            System.out.println(f.getName().split("\\.")[0]);
                String className = packageName + "." + f.getName().split("\\.")[0];
//            System.out.println(className);
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(component.class)) {
                    component annotation = clazz.getAnnotation(component.class);
                    String id = annotation.value();
//                    System.out.println(id);
                    Constructor<?> con = clazz.getDeclaredConstructor();
                    Object obj = con.newInstance();
                    beans.put(id , obj);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println(beans);
    }
}
