package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.CarMapper;
import com.lyl.mybatis.pojo.Car;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 *ClassName: CarMapperTest
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/24 11:08
 *@Author lyl
 *@Version 1.0
 */
public class CarMapperTest {
    @Test
    public void testSelectByPrimaryKey () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = mapper.selectByPrimaryKey(1L);
        System.out.println(car);
        sqlSession.close();
    }

    @Test
    public void testDeleteByPrimaryKey () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        int ret = mapper.deleteByPrimaryKey(76L);
        System.out.println(ret);
        sqlSession.commit();
        sqlSession.close();
    }
}
