package com.lyl.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *ClassName: Student
 *Package: com.lyl.mybatis.pojo
 *Description:创建于 2025/5/23 17:34
 *@Author lyl
 *@Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private Integer sid;
    private String sname;
    private Clazz clazz;
}
