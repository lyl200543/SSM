package com.lyl.mybatis;

import com.lyl.mybatis.Util.SqlSessionUtil;
import com.lyl.mybatis.pojo.car;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

/**
 *ClassName: CarMapperTest
 *Package: com.lyl.mybatis
 *Description:创建于 2025/5/15 15:56
 *@Author lyl
 *@Version 1.0
 */
public class CarMapperTest {
    @Test
    public void testNamespace () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        List<Object> list = sqlSession.selectList("Car.selectAll");
        for (Object car : list) {
            System.out.println(car);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectAll () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        List<Object> list = sqlSession.selectList("selectAll");
        for (Object car : list) {
            System.out.println(car);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectById () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        Object car = sqlSession.selectOne("selectById" , 1L);
        System.out.println(car);
        sqlSession.close();
    }

    @Test
    public void testUpdateById () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        car car = new car(4L , "9999" , "凯美瑞" , 30.3 , "1999-11-10" , "燃油车");
        sqlSession.update("updateById" , car);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteById () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        sqlSession.delete("deleteById" , 24L);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsertCarByPojo () {
        car car = new car(null , "3333" , "比亚迪秦" , 30.0 , "2020-11-11" , "新能源");
        SqlSession sqlSession = SqlSessionUtil.openSession();
        sqlSession.insert("insertCar" , car);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsertCarByMap () {
        //从前端接受到数据
        HashMap<String, Object> map = new HashMap<>();
        map.put("carNum" , "1111");
        map.put("brand" , "比亚迪汉");
        map.put("guidePrice" , 10.0);
        map.put("produceTime" , "2020-11-11");
        map.put("carType" , "电车");

        SqlSession sqlSession = SqlSessionUtil.openSession();
        sqlSession.insert("insertCar" , map);
        sqlSession.commit();
        sqlSession.close();
    }
}
