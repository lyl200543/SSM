package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.ClazzMapper;
import com.lyl.mybatis.pojo.Clazz;
import com.lyl.mybatis.util.SqlSessionUtil;
import com.sun.source.doctree.StartElementTree;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 *ClassName: ClazzMapperTest
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/23 17:39
 *@Author lyl
 *@Version 1.0
 */
public class ClazzMapperTest {
    @Test
    public void testSelectByStep () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);
        Clazz clazz = mapper.selectByStep(1001);
//        System.out.println(clazz);
        System.out.println(clazz.getCname());
        //System.out.println(clazz.getStus());
        sqlSession.close();
    }

    @Test
    public void testSelectByCollection () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);
        Clazz clazz = mapper.selectByCollection(1001);
        System.out.println(clazz);
        sqlSession.close();
    }
}
