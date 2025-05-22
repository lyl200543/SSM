package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.CarMapper;
import com.lyl.mybatis.pojo.Car;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 *ClassName: CarMapperTes
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/22 19:03
 *@Author lyl
 *@Version 1.0
 */
public class CarMapperTest {
    @Test
    public void testUpdateBySet () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = new Car(73L , null , null , 666.0 , null , "燃油车");
        mapper.updateBySet(car);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateById () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //不使用set标签时，如果只想修改部分数据，不修改的数据赋值null,会出现问题
        Car car = new Car(73L , null , null , 100.0 , null , "新能源车");
        mapper.updateById(car);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectByMutipleConditonsWithTrim () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = mapper.selectByMutipleConditonsWithTrim("宝马" , 40.0 , "燃油车");
//        List<Car> cars = mapper.selectByMutipleConditonsWithTrim("" , null , "");
//        List<Car> cars = mapper.selectByMutipleConditonsWithTrim("" , 20.0 , "燃油车");
//        List<Car> cars = mapper.selectByMutipleConditonsWithTrim("宝马" , null , "");
        cars.forEach(car -> System.out.println(car));
        sqlSession.close();
    }

    @Test
    public void testSelectByMutipleConditonsWithWhere () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
//        List<Car> cars = mapper.selectByMutipleConditonsWithWhere("宝马",40.0,"燃油车") ;
//        List<Car> cars = mapper.selectByMutipleConditonsWithWhere("" , null , "");
//        List<Car> cars = mapper.selectByMutipleConditonsWithWhere("" , 20.0 , "燃油车");
        List<Car> cars = mapper.selectByMutipleConditonsWithWhere("宝马" , null , "");
        cars.forEach(car -> System.out.println(car));
        sqlSession.close();
    }

    @Test
    public void testSelectByMutipleConditons () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = mapper.selectByMutipleConditons("宝马" , 40.0 , "燃油车");
        cars.forEach(car -> System.out.println(car));
        sqlSession.close();
    }
}
