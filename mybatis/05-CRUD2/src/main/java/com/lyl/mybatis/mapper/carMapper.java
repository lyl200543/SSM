package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Car;

import javax.smartcardio.Card;
import java.util.List;
import java.util.function.LongToIntFunction;

/**
 *ClassName: carMapper
 *Package: com.lyl.mybatis
 *Description:创建于 2025/5/20 18:26
 *@Author lyl
 *@Version 1.0
 */
public interface carMapper {
    int insert (Car car);

    int deleteById (Long id);

    int update (Car car);

    Car selectById (Long id);

    List<Car> selectAll ();
}
