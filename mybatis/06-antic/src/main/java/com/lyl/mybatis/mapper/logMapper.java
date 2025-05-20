package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.log;

import java.util.List;

/**
 *ClassName: logMapper
 *Package: com.lyl.mybatis.mapper
 *Description:创建于 2025/5/20 20:09
 *根据日期查询不同的表
 *@Author lyl
 *@Version 1.0
 */
public interface logMapper {
    List<log> selectByDate(String date);
}
