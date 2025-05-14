package com.lyl.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 *ClassName: CarMapperTest
 *Package: com.lyl.mybatis
 *Description:创建于 2025/5/14 20:41
 *@Author lyl
 *@Version 1.0
 */
public class CarMapperTest {//名字规范:你要测试的类名+Test

    //一般是一个业务方法对应一个测试方法
    // 测试方法的规范:public void testXxxx(){}
    // 测试方法的方法名:以test开始。假设测试的方法是sum，这个测试方法名:testsum
    @Test
    public void testInsertCar(){
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
