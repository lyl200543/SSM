package cn.lyl.spring6.Dao.Impl;

import cn.lyl.spring6.Dao.WorkerDao;
import org.springframework.stereotype.Repository;

/**
 *ClassName: WorkerDaoImplForMySQL
 *Package: cn.lyl.spring6.Dao.Impl
 *Description:创建于 2025/5/31 14:06
 *@Author lyl
 *@Version 1.0
 */
@Repository("mysql")
public class WorkerDaoImplForMySQL implements WorkerDao {
    @Override
    public void deleteById () {
        System.out.println("MySQL数据库正在删除员工数据...");
    }
}
