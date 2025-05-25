package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Car;
import jdk.jfr.Percentage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper {

    List<Car> selectByLimit (@Param ("startIndex") Integer startIndex ,
                             @Param ("pageSize") Integer pageSize);

    int deleteByPrimaryKey (Long id);

    int insert (Car row);

    Car selectByPrimaryKey (Long id);

    List<Car> selectAll ();

    int updateByPrimaryKey (Car row);
}