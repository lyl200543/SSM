package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.CarMapper;
import com.lyl.mybatis.pojo.Car;
import com.lyl.mybatis.pojo.CarExample;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 *ClassName: CarMapperTest
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/24 11:21
 *@Author lyl
 *@Version 1.0
 */
public class CarMapperTest {
    @Test
    public void testSelectByExample () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //参数为null时，表示查找全部记录
        List<Car> cars = mapper.selectByExample(null);
        cars.forEach(car -> System.out.println(car));

        //多条件查询
        //QBC ⻛格：Query By Criteria ⼀种查询⽅式，⽐较⾯向对象，看不到sql语句。
        //WHERE ( brand = ? and guide_price > ? ) or( car_type = ? )
        CarExample carExample = new CarExample();
        carExample.createCriteria() .andBrandEqualTo("兰博基尼")
                                    .andGuidePriceGreaterThan(new BigDecimal(10.0));
        carExample.or().andCarTypeEqualTo("电车");

        List<Car> cars1 = mapper.selectByExample(carExample);
        cars1.forEach(car -> System.out.println(car));

        sqlSession.close();
    }
}
