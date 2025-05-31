package org.lyl.spring6.Dao.Impl;

import org.lyl.spring6.Dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 *ClassName: StudentDaoImplForOracle
 *Package: org.lyl.spring6.Dao.Impl
 *Description:创建于 2025/5/31 11:20
 *@Author lyl
 *@Version 1.0
 */
//@Repository
public class StudentDaoImplForOracle implements StudentDao {
    @Override
    public void insert () {
        System.out.println("Oracle数据库正在保存信息...");
    }
}
