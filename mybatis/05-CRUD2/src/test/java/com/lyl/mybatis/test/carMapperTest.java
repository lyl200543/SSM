package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.carMapper;
import com.lyl.mybatis.pojo.Car;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 *ClassName: test
 *Package: com.lyl.mybatis
 *Description:创建于 2025/5/20 18:38
 *@Author lyl
 *@Version 1.0
 */
public class carMapperTest {
    @Test
    public void testInsert () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        carMapper mapper = sqlSession.getMapper(carMapper.class);
        Car car = new Car(null , "404" , "保时捷" , 1000.0 , "2005-4-30" , "燃油车");
        System.out.println(mapper.insert(car));
        sqlSession.commit();
    }

    @Test
    public void testDelete () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        carMapper mapper = sqlSession.getMapper(carMapper.class);
        System.out.println(mapper.deleteById(71L));
        sqlSession.commit();
    }

    @Test
    public void testUpdate () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        carMapper mapper = sqlSession.getMapper(carMapper.class);
        Car car = new Car(72L , "444" , "保时捷404" , 9999.0 , "2007-4-30" , "电车");
        System.out.println(mapper.update(car));
        sqlSession.commit();
    }

    @Test
    public void testSelectOne () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        carMapper mapper = sqlSession.getMapper(carMapper.class);
        Car car = mapper.selectById(1L);
        System.out.println(car);
    }

    @Test
    public void testSelectAll () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        carMapper mapper = sqlSession.getMapper(carMapper.class);
        List<Car> cars = mapper.selectAll();
        cars.forEach(car-> System.out.println(car));
    }
}
