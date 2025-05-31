package cn.lyl.spring6.Service;

import cn.lyl.spring6.Dao.WorkerDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *ClassName: WorkerService
 *Package: cn.lyl.spring6.Service
 *Description:创建于 2025/5/31 14:07
 *@Author lyl
 *@Version 1.0
 */
@Service
public class WorkerService {
    @Resource (name = "mysql")
    private WorkerDao workerDao;

    public void delete () {
        workerDao.deleteById();
    }
}
