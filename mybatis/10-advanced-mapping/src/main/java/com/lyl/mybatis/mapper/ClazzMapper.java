package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Clazz;

/**
 *ClassName: ClazzMapper
 *Package: com.lyl.mybatis.mapper
 *Description:创建于 2025/5/23 17:37
 *@Author lyl
 *@Version 1.0
 */
public interface ClazzMapper {
    //第⼆种⽅式：分步查询
    Clazz selectByStep (Integer id);

    //第⼀种⽅式：collection
    Clazz selectByCollection (Integer id);

    Clazz selectById (Integer id);
}
