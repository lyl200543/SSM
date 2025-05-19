package com.lyl.bank.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.sql.Connection;

/**
 *ClassName: SqlSessionUtil
 *Package: com.lyl.mybatis.Util
 *Description:创建于 2025/5/15 14:22
 *@Author lyl
 *@Version 1.0
 */
public class SqlSessionUtil {

    private static SqlSessionFactory ssf;
    private static ThreadLocal<SqlSession> local = new ThreadLocal<>();

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
        SqlSession sqlSession = local.get();
        if (sqlSession == null) {
            sqlSession = ssf.openSession();
            local.set(sqlSession);
        }
        return sqlSession;
    }

    public static void close () {
        SqlSession sqlSession = local.get();
        if (sqlSession != null) {
            sqlSession.close();
            local.remove();
        }
    }
}
