package com.lyl.mybatis.mapper;

import com.lyl.mybatis.pojo.Student;

import java.util.List;

/**
 *ClassName: StudentMapper
 *Package: com.lyl.mybatis.mapper
 *Description:创建于 2025/5/23 17:37
 *@Author lyl
 *@Version 1.0
 */
public interface StudentMapper {
    List<Student> selectByCid (Integer cid);

    //根据sid查学生的信息（包括班级信息）
    Student selectByIdStep1 (Integer id);

    Student selectByIdAssociation (Integer id);

    Student selectById (Integer id);
}
