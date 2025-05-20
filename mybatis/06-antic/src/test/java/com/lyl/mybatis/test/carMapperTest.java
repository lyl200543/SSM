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
    public void testSelectByAscOrDesc () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        carMapper mapper = sqlSession.getMapper(carMapper.class);
        List<Car> cars = mapper.selectByAscOrDesc("asc");
        cars.forEach(car -> System.out.println(car));
    }

    @Test
    public void testSelectByCarType () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        carMapper mapper = sqlSession.getMapper(carMapper.class);
        List<Car> cars = mapper.selectByCarType("燃油车");
        cars.forEach(car -> System.out.println(car));
    }
}
