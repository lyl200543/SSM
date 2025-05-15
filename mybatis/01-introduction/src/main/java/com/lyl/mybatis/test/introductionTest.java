package com.lyl.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 *ClassName: test
 *Package: com.lyl.mybatis
 *Description:创建于 2025/5/14 18:41
 *@Author lyl
 *@Version 1.0
 */
public class introductionTest {
    public static void main (String[] args) throws IOException {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

        //Resources.getResourceAsStream默认就是从类的根路径下开始加载
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        InputStream is2=ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory ssf = ssfb.build(is);

        SqlSession ss = ssf.openSession();

        int ret = ss.insert("insertCar");
        System.out.println("影响的行数：" + ret);

        //手动提交
        ss.commit();
    }
}
