package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.studentMapper;
import com.lyl.mybatis.pojo.Student;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *ClassName: studentMapperTest
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/21 15:55
 *@Author lyl
 *@Version 1.0
 */
public class studentMapperTest {
    @Test
    public void testSelectByNameAndSex2 () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.selectByNameAndSex2("小红" , '女');
        students.forEach(student -> System.out.println(student));
        sqlSession.close();
    }

    @Test
    public void testSelectByNameAndSex () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.selectByNameAndSex("小红" , '女');
        students.forEach(student -> System.out.println(student));
        sqlSession.close();
    }

    @Test
    public void testInsertByPojo () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        Student student = new Student(null , "小红" , 12 , 1.42 , new Date() , '女');
        mapper.insertByPojo(student);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsertByMap () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("姓名" , "王五");
        map.put("年龄" , 25);
        map.put("身高" , 1.90);
        map.put("生日" , new Date());
        map.put("性别" , '男');
        mapper.insertByMap(map);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testSelectById () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.selectById(1L);
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testSelectByName () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.selectByName("张三");
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testSelectByAge () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.selectByAge(18);
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testSelectByHeight () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.selectByHeight(1.61);
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testSelectByBirth () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1988-10-11");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Student> students = mapper.selectByBirth(date);
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testSelectBySex () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.selectBySex('男');
        students.forEach(student -> System.out.println(student));
    }
}
