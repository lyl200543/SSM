package com.lyl.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

/**
 *ClassName: test
 *Package: com.lyl.mybatis
 *Description:创建于 2025/5/15 20:12
 *@Author lyl
 *@Version 1.0
 */
public class test {


    @Test
    public void testDataSource () throws IOException {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = ssfb.build(Resources.getResourceAsStream("mybatis-config.xml"));
//        SqlSession sqlSession1 = ssf.openSession();
//        sqlSession1.insert("Car.insertCar");
//        sqlSession1.commit();
//        sqlSession1.close();
//
//        SqlSession sqlSession2 = ssf.openSession();
//        sqlSession2.insert("Car.insertCar");
//        sqlSession2.commit();
//        sqlSession2.close();

        for (int i = 0 ; i < 3 ; i++) {
            SqlSession sqlSession = ssf.openSession();
            sqlSession.insert("Car.insertCar");
            //不关闭连接，测试最大连接数
        }
    }

    @Test
    public void testConfiguration () throws IOException {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //数据库为默认
        SqlSessionFactory ssf = ssfb.build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = ssf.openSession();
        System.out.println(sqlSession.insert("insertCar"));
        sqlSession.commit();
        sqlSession.close();

        //指定数据库
        SqlSessionFactory ssf2 = ssfb.build(Resources.getResourceAsStream("mybatis-config.xml") , "powernodeDB");
        SqlSession sqlSession2 = ssf2.openSession();
        System.out.println(sqlSession2.insert("insertCar"));
        sqlSession2.commit();
        sqlSession2.close();
    }
}
