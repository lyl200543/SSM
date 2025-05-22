package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Car;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 *ClassName: CarMapper
 *Package: com.lyl.mybatis.mapper
 *Description:创建于 2025/5/22 14:29
 *@Author lyl
 *@Version 1.0
 */
public interface CarMapper {
    //返回总记录条数
    Long selectAllRetCount ();

    //测试驼峰命名自动映射
    List<Car> selectAllBySettings ();

    //测试resultMap
    List<Car> selectAllByResultMap ();

    //返回Map<Long,Map<String,Object>> -->方便查找不同的记录（map）
    @MapKey ("id")
    Map<Long, Map<String, Object>> selectAllMap ();

    //返回List<Map<String,Object>>
    List<Map<String, Object>> selectAllRetMap ();

    //返回Map<String,Object>
    Map<String, Object> selectByIdRetMap (Long id);

    //返回List<Car>
    List<Car> selectAll ();

    //返回Car
    Car selectById (Long id);
}
