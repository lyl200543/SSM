package cn.lyl.spring6.Dao.Impl;

import cn.lyl.spring6.Dao.WorkerDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

/**
 *ClassName: WorkerDaoImplForOracle
 *Package: cn.lyl.spring6.Dao.Impl
 *Description:创建于 2025/5/31 14:16
 *@Author lyl
 *@Version 1.0
 */
//@Repository ("workerDao")
@Repository ("oracle")
public class WorkerDaoImplForOracle implements WorkerDao {
    @Override
    public void deleteById () {
        System.out.println("Oracle数据库正在删除员工数据...");
    }
}
