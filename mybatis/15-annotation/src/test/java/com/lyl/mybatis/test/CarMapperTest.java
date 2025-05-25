package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.CarMapper;
import com.lyl.mybatis.pojo.Car;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 *ClassName: CarMapperTest
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/24 14:38
 *@Author lyl
 *@Version 1.0
 */
public class CarMapperTest {
    @Test
    public void testSelectAll () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = mapper.selectAll();
        cars.forEach(car -> System.out.println(car));
        sqlSession.close();
    }


    @Test
    public void testUpdateById () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = new Car(75L , "6666" , "卡罗拉" , 30.0 , "2000-10-10" , "燃油⻋");
        int ret = mapper.updateById(car);
        System.out.println(ret);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteById () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        int ret = mapper.deleteById(77L);
        System.out.println(ret);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsert () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = new Car(null , "6666" , "卡罗拉" , 30.0 , "2000-10-10" , "燃油⻋");
        int insert = mapper.insert(car);
        System.out.println(insert);
        sqlSession.commit();
        sqlSession.close();
    }
}
