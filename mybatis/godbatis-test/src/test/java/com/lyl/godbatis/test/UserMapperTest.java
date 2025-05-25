package com.lyl.godbatis.test;

import com.lyl.godbatis.pojo.User;
import org.god.batis.core.SqlSession;
import org.god.batis.core.SqlSessionFactory;
import org.god.batis.core.SqlSessionFactoryBuilder;
import org.god.batis.utils.Resources;
import org.junit.jupiter.api.Test;

/**
 *ClassName: UserMapperTest
 *Package: com.lyl.godbatis.test
 *Description:创建于 2025/5/25 14:12
 *@Author lyl
 *@Version 1.0
 */
public class UserMapperTest {
    @Test
    public void testInsertUser () {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("godbatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User("5555" , "孙悟空" , "5000");
        int count = sqlSession.insert("User.insertUser" , user);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectOne () {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("godbatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = (User) sqlSession.selectOne("User.selectOne" , "5555");
        System.out.println(user);
        sqlSession.close();
    }
}
