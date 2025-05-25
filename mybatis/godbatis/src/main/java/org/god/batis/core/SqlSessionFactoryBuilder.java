package org.god.batis.core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.god.batis.utils.Resources;

import javax.sql.DataSource;
import java.io.InputStream;
import java.io.Reader;
import java.lang.module.ResolutionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *ClassName: SqlSessionFactoryBuilder
 *Package: org.god.batis.utils.com.god.batis.core
 *Description:创建于 2025/5/24 20:24
 *解析mybatis-config.xml,创建SqlSessionFactory对象
 *@Author lyl
 *@Version 1.0
 */
public class SqlSessionFactoryBuilder {
    public SqlSessionFactoryBuilder () {
    }

    public SqlSessionFactory build (InputStream in) {
        //解析mybatis-config.xml
        SqlSessionFactory sqlSessionFactory = null;
        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(in);
            Element environments = (Element) document.selectSingleNode("/configuration/environments");
            String aDefault = environments.attributeValue("default");
            Element environment = (Element) document.selectSingleNode("/configuration/environments/environment[@id='" + aDefault + "']");
            Element transactionManager = environment.element("transactionManager");
            Element source = environment.element("dataSource");

            DataSource dataSource = getDataSource(source);
            Transaction transaction = getTransaction(transactionManager , dataSource);
            List<Node> mappers = document.selectNodes("//mapper");
            List<String> xmlPaths = new ArrayList<>();
            mappers.forEach(mapper -> {
                Element element = (Element) mapper;
                String xmlPath = element.attributeValue("resource");
                xmlPaths.add(xmlPath);
            });
            Map<String, MappedStatement> mappedStatements = getMappedStatements(xmlPaths);

            sqlSessionFactory = new SqlSessionFactory(transaction , mappedStatements);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return sqlSessionFactory;
    }

    private Map<String, MappedStatement> getMappedStatements (List<String> xmlPaths) {
        Map<String, MappedStatement> map = new HashMap<>();
        xmlPaths.forEach(xmlPath -> {
            try {
                SAXReader saxReader = new SAXReader();
                Document document = saxReader.read(Resources.getResourceAsStream(xmlPath));
                Element mapper = (Element) document.selectSingleNode("/mapper");
                String namespace = mapper.attributeValue("namespace");
                List<Element> sqls = mapper.elements();
                sqls.forEach(sql -> {
                    String id = sql.attributeValue("id");
                    String resultType = sql.attributeValue("resultType");
                    String textTrim = sql.getTextTrim();
                    String sqlId = namespace + "." + id;
                    MappedStatement mappedStatement = new MappedStatement(textTrim , resultType);
                    map.put(sqlId , mappedStatement);
                });

            } catch (DocumentException e) {
                e.printStackTrace();
            }

        });
        return map;
    }

    private Transaction getTransaction (Element transactionManager , DataSource dataSource) {
        Transaction transaction = null;
        String transType = transactionManager.attributeValue("type");
        String type = transType.trim().toUpperCase();
        if (Const.JDBC_TRANSACTION.equals(type)) {
            transaction = new JDBCTransaction(dataSource , false);
        }
        if (Const.MANAGED_TRANSACTION.equals(type)) {
            transaction = new ManagedTransaction();
        }
        return transaction;

    }

    private DataSource getDataSource (Element source) {
        DataSource dataSource = null;
        List<Element> properties = source.elements();
        Map<String, String> map = new HashMap<>();
        properties.forEach(property -> {
            String name = property.attributeValue("name");
            String value = property.attributeValue("value");
            map.put(name , value);
        });

        String dataSourctType = source.attributeValue("type");
        String type = dataSourctType.toUpperCase().trim();
        if (Const.UN_POOLED_DATASOURCE.equals(type)) {
            dataSource = new UNPOOLEDDataSource(map.get("driver") , map.get("url") , map.get("username") , map.get("password"));
        }
        if (Const.POOLED_DATASOURCE.equals(type)) {
            dataSource = new POOLEDDataSource();
        }
        if (Const.JNDI_DATASOURCE.equals(type)) {
            dataSource = new JNDIDataSource();
        }
        return dataSource;
    }
}
