package com.lyl.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *ClassName: clazz
 *Package: com.lyl.mybatis.pojo
 *Description:创建于 2025/5/23 17:34
 *@Author lyl
 *@Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Clazz {
    private Integer cid;
    private String cname;
    private List<Student> stus;
}
