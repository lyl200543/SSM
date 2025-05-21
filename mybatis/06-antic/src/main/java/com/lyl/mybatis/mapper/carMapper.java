package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Car;

import java.util.List;

/**
 *ClassName: carMapper
 *Package: com.lyl.mybatis
 *Description:创建于 2025/5/20 18:26
 *@Author lyl
 *@Version 1.0
 */
public interface carMapper {
    List<Car> selectByCarType (String carType);

    List<Car> selectByAscOrDesc (String ascOrDesc);

    int deleteBatch (String carIds);

    List<Car> selectByBrandLike (String brand);

    int insertReturnGeneratedKey (Car car);
}
