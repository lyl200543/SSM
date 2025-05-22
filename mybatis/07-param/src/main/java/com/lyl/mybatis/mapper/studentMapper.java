package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.net.CacheRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *ClassName: studentMapper
 *Package: com.lyl.mybatis.mapper
 *Description:创建于 2025/5/21 15:50
 *@Author lyl
 *@Version 1.0
 */
public interface studentMapper {
    //多参数
    List<Student> selectByNameAndSex2 (@Param("name") String name ,@Param("sex") Character sex);

    //如果是多个参数的话，mybatis框架底层是怎么做的呢?
    //mybatis框架会自动创建一个map集合。并且Map集合是以这种方式存储参数的:
    //map.put("arg0",name);
    //map.put("arg1",sex);
    //map.put("param0"，name);
    //map.put("param1",sex);
    List<Student> selectByNameAndSex (String name , Character sex);

    //单个参数
    //实体类
    int insertByPojo (Student student);

    //map集合
    int insertByMap (Map<String, Object> map);

    //简单类型
    List<Student> selectById (Long id);

    List<Student> selectByName (String name);

    List<Student> selectByAge (Integer age);

    List<Student> selectByHeight (Double height);

    List<Student> selectByBirth (Date date);

    List<Student> selectBySex (Character sex);

}
