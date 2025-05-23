package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.StudentMapper;
import com.lyl.mybatis.pojo.Student;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 *ClassName: StudentMapperTest
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/23 17:39
 *@Author lyl
 *@Version 1.0
 */
public class StudentMapperTest {
    @Test
    public void testSelectByIdStep1 () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectByIdStep1(1);
        System.out.println(student.getSname());
        //System.out.println(student.getClazz().getCname());
        sqlSession.close();
    }

    @Test
    public void testSelectByIdAssociation () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectByIdAssociation(1);
        System.out.println(student);
        sqlSession.close();
    }

    @Test
    public void testSelectById () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectById(1);
        System.out.println(student);
        sqlSession.close();
    }
}
