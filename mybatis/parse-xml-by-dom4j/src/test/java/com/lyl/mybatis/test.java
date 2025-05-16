package com.lyl.mybatis;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.rmi.server.ExportException;
import java.util.List;

/**
 *ClassName: test
 *Package: com.lyl.mybatis
 *Description:创建于 2025/5/16 17:21
 *@Author lyl
 *@Version 1.0
 */
public class test {
    @Test
    public void testParseMapperXml () throws Exception {
        SAXReader saxReader = new SAXReader();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("CarMapper.xml");
        Document document = saxReader.read(is);
        String xpath = "/mapper";
        Element mapper = (Element) document.selectSingleNode(xpath);
        System.out.println(mapper.attributeValue("namespace"));

        List<Element> elements = mapper.elements();
        elements.forEach(element -> {
            System.out.println(element.attributeValue("id"));
            System.out.println(element.attributeValue("resultType"));
            String sql = element.getTextTrim();
            System.out.println(sql);
            //把#{}变为？
            //在 #{...} 这个模式里：
            //{ 必须转义（\\{），因为它是字面量 {，而不是量词({3})
            //} 不需要转义，因为它前面没有未闭合的 {，正则引擎会直接匹配字面量的 }。
            String newSql = sql.replaceAll("#\\{[0-9a-zA-Z-$]*}" , "?");
            System.out.println(newSql);

            System.out.println();
        });
    }

    @Test
    public void testParseConfigXml () throws Exception {
        SAXReader saxReader = new SAXReader();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis-config.xml");
        Document document = saxReader.read(is);
//        Element rootElement = document.getRootElement();

        //xpath是做标签路径匹配的。能够让我们快速定位XML文件中的元素。
        //以下的xpath代表了:从根下开始找configuration标签，然后找configuration标签下的子标签environments
        String xpath = "/configuration/environments";
        Element environments = (Element) document.selectSingleNode(xpath);
        String defaultEnvironment = environments.attributeValue("default");
//        System.out.println(defaultEnvironment);
        xpath = "/configuration/environments/environment[@id='" + defaultEnvironment + "']";
        Element envirEle = (Element) document.selectSingleNode(xpath);
//        System.out.println(envirEle.getName());

        //Element的element()方法用来获取孩子节点
        Element transactionManager = envirEle.element("transactionManager");
        System.out.println(transactionManager.attributeValue("type"));

        Element dataSource = envirEle.element("dataSource");
        System.out.println(dataSource.attributeValue("type"));
        List<Element> properties = dataSource.elements();
        properties.forEach(property -> {
            String name = property.attributeValue("name");
            String value = property.attributeValue("value");
            System.out.println(name + "=" + value);
        });

        //不想从根下开始获取，你想从任意位置开始，获取所有的某个标签，xpath该这样写
        xpath = "//mapper";
        List<Node> mappers = document.selectNodes(xpath);
        mappers.forEach(mapper -> {
            Element ele = (Element) mapper;
            System.out.println(ele.attributeValue("resource"));
        });

    }
}
