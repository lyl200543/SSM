package com.lyl.mybatis.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 *ClassName: SqlSessionUtil
 *Package: com.lyl.mybatis.Util
 *Description:创建于 2025/5/15 14:22
 *@Author lyl
 *@Version 1.0
 */
public class SqlSessionUtil {

    private static SqlSessionFactory ssf;

    static {
        try {
            SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
            ssf = ssfb.build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private SqlSessionUtil () {
    }


    public static SqlSession openSession () {
        return ssf.openSession();
    }
}
