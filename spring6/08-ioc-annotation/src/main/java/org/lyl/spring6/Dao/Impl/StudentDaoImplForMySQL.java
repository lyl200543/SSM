package org.lyl.spring6.Dao.Impl;

import org.lyl.spring6.Dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 *ClassName: StudentDaoImplForMySQL
 *Package: org.lyl.Dao.Impl
 *Description:创建于 2025/5/31 11:11
 *@Author lyl
 *@Version 1.0
 */
@Repository
public class StudentDaoImplForMySQL implements StudentDao {
    @Override
    public void insert () {
        System.out.println("MySQL数据库正在保存学生信息...");
    }
}
