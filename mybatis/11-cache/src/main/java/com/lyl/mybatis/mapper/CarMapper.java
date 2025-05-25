package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Car;
import org.apache.ibatis.annotations.Param;

/**
 *ClassName: CarMapper
 *Package: com.lyl.mybatis.mapper
 *Description:创建于 2025/5/24 8:56
 *@Author lyl
 *@Version 1.0
 */
public interface CarMapper {
    Car selectById2 (Long id);

    int insertClazz (@Param ("cid") Integer cid , @Param ("cname") String cname);

    Car selectById (Long id);
}
