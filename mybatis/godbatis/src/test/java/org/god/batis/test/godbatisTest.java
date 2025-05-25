package org.god.batis.test;

import org.god.batis.pojo.User;
import org.god.batis.core.SqlSession;
import org.god.batis.core.SqlSessionFactory;
import org.god.batis.core.SqlSessionFactoryBuilder;
import org.god.batis.utils.Resources;
import org.junit.jupiter.api.Test;

/**
 *ClassName: godbatisTest
 *Package: org.god.batis.test
 *Description:创建于 2025/5/25 9:20
 *@Author lyl
 *@Version 1.0
 */
public class godbatisTest {
    @Test
    public void testCreateSqlSessionFactory () {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("godbatis-config.xml"));
        System.out.println(sqlSessionFactory);
    }

    @Test
    public void testInsertUser () {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("godbatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User("1111" , "zhangshan" , "20");
        sqlSession.insert("User.insertUser" , user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectOne () {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("godbatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Object ret = sqlSession.selectOne("User.selectOne" , "1111");
        System.out.println(ret);
        sqlSession.close();
    }
}
