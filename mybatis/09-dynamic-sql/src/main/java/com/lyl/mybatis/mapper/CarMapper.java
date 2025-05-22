package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Car;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.builder.CacheRefResolver;

import java.util.List;

/**
 *ClassName: CarMapper
 *Package: com.lyl.mybatis.mapper
 *Description:创建于 2025/5/22 19:01
 *@Author lyl
 *@Version 1.0
 */
public interface CarMapper {

    int updateBySet (Car car);

    int updateById (Car car);

    List<Car> selectByMutipleConditonsWithTrim (@Param ("brand") String brand ,
                                                @Param ("guidePrice") Double guidePrice ,
                                                @Param ("carType") String carType);


    List<Car> selectByMutipleConditonsWithWhere (@Param ("brand") String brand ,
                                                 @Param ("guidePrice") Double guidePrice ,
                                                 @Param ("carType") String carType);

    List<Car> selectByMutipleConditons (@Param ("brand") String brand ,
                                        @Param ("guidePrice") Double guidePrice ,
                                        @Param ("carType") String carType);
}




