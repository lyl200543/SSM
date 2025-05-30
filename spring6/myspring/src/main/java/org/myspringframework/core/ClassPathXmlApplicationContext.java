package org.myspringframework.core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *ClassName: ClassPathXmlApplicationContext
 *Package: org.myspringframework.core
 *Description:创建于 2025/5/30 18:30
 *@Author lyl
 *@Version 1.0
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
    private Map<String, Object> beans = new HashMap<>();

    public ClassPathXmlApplicationContext () {
    }

    public ClassPathXmlApplicationContext (String configLocation) {
        //解析XML文件
        try {
            SAXReader saxReader = new SAXReader();
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            Document document = saxReader.read(is);
            List<Node> nodes = document.selectNodes("//bean");
            nodes.forEach(node -> {
                //曝光
                try {
                    Element element = (Element) node;
                    String id = element.attributeValue("id");
                    String aClass = element.attributeValue("class");
                    Class<?> clazz = Class.forName(aClass);
                    Constructor<?> con = clazz.getDeclaredConstructor();
                    Object obj = con.newInstance();
                    beans.put(id , obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //set注入
                try {
                    Element element = (Element) node;
                    String id = element.attributeValue("id");
                    String aClass = element.attributeValue("class");
                    Class<?> clazz = Class.forName(aClass);
                    Object obj = beans.get(id);
                    List<Element> elements = element.elements();
                    elements.forEach(ele -> {
                        try {
                            String propertyName = ele.attributeValue("name");
                            String propertyValue = ele.attributeValue("value");
                            String propertyRef = ele.attributeValue("ref");
                            Field field = clazz.getDeclaredField(propertyName);
                            String methodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
                            Method method = clazz.getDeclaredMethod(methodName , field.getType());
                            if (propertyValue != null) {
                                Object value = null;
                                //要获得类型的简单名，不然是全类名，不好匹配
                                switch (field.getType().getSimpleName()) {
                                    case "byte":
                                        value = Byte.parseByte(propertyValue);
                                        break;
                                    case "char":
                                        value = propertyValue.charAt(0);
                                        break;
                                    case "int":
                                        value = Integer.parseInt(propertyValue);
                                        break;
                                    case "float":
                                        value = Float.parseFloat(propertyValue);
                                        break;
                                    case "double":
                                        value = Double.parseDouble(propertyValue);
                                        break;
                                    case "boolean":
                                        value = Boolean.parseBoolean(propertyValue);
                                        break;
                                    case "String":
                                        value = propertyValue;
                                        break;

                                }
                                method.invoke(obj , value);
                            }
                            if (propertyRef != null) {
                                method.invoke(obj , beans.get(propertyRef));
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean (String name) {
        return beans.get(name);
    }
}
