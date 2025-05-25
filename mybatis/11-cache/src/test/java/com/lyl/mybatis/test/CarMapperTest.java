package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.CarMapper;
import com.lyl.mybatis.pojo.Car;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

/**
 *ClassName: CarMapperTest
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/24 8:57
 *@Author lyl
 *@Version 1.0
 */
public class CarMapperTest {
    @Test
    public void testSelectById2 () throws Exception {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = ssfb.build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession1 = ssf.openSession();
        SqlSession sqlSession2 = ssf.openSession();

        CarMapper mapper1 = sqlSession1.getMapper(CarMapper.class);
        Car car1 = mapper1.selectById2(1L);
        System.out.println(car1);

        //一级缓存放到二级缓存
        sqlSession1.close();

        CarMapper mapper2 = sqlSession2.getMapper(CarMapper.class);
        Car car2 = mapper2.selectById2(1L);
        System.out.println(car2);

//        sqlSession1.close();
        sqlSession2.close();
    }

    @Test
    public void testSelectById () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = mapper.selectById(1L);
        System.out.println(car);

        //中间操作
        //sqlSession.clearCache();
        CarMapper mapper2 = sqlSession.getMapper(CarMapper.class);
        mapper2.insertClazz(1003 , "高三3班");

        //SqlSession sqlSession1 = SqlSessionUtil.openSession();
        CarMapper mapper1 = sqlSession.getMapper(CarMapper.class);
        Car car1 = mapper1.selectById(1L);
        System.out.println(car1);
        sqlSession.commit();
        sqlSession.close();
    }

}
