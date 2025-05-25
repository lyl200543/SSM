package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Car;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *ClassName: CarMapper
 *Package: com.lyl.mybatis.mapper
 *Description:创建于 2025/5/24 14:36
 *@Author lyl
 *@Version 1.0
 */
public interface CarMapper {
    //没开启驼峰命名自动转换时：
    @Results ({
            @Result (column = "id", property = "id") ,
            @Result (column = "car_num", property = "carNum") ,
            @Result (column = "brand", property = "brand") ,
            @Result (column = "guide_price", property = "guidePrice") ,
            @Result (column = "produce_time", property = "produceTime") ,
            @Result (column = "car_type", property = "carType")
    })
    @Select ("select * from t_car")
    List<Car> selectAll ();

    @Update ("update t_car set car_num=#{carNum},brand=#{brand},guide_price=#{guidePrice},produce_time=#{produceTime},car_type=#{carType} where id=#{id}")
    int updateById (Car car);

    @Delete ("delete from t_car where id=#{id}")
    int deleteById (Long id);

    @Insert ("insert into t_car values(null,#{carNum},#{brand},#{guidePrice},#{produceTime},#{carType})")
    int insert (Car car);
}
