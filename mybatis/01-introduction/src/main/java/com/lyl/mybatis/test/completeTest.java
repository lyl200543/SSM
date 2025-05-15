package com.lyl.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 *ClassName: completeTest
 *Package: com.lyl.mybatis
 *Description:创建于 2025/5/14 20:27
 *@Author lyl
 *@Version 1.0
 */
public class completeTest {
    public static void main (String[] args) {
        SqlSession ss=null;
        try {
            SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
            SqlSessionFactory ssf = ssfb.build(Resources.getResourceAsStream("mybatis-config.xml"));
            ss = ssf.openSession();
            int ret = ss.insert("insertCar");
            System.out.println(ret);
            ss.commit();
        } catch (IOException e) {
            if(ss!=null)
                ss.rollback();
            e.printStackTrace();
        }finally {
            if(ss!=null)
                ss.close();
        }

    }
}
