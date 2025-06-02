package com.lyl.bank.service;

import com.lyl.bank.dao.AccountDao;
import com.lyl.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 *ClassName: IsolationService2
 *Package: com.lyl.bank.service
 *Description:创建于 2025/6/2 14:20
 *@Author lyl
 *@Version 1.0
 */
@Service ("i2")
public class IsolationService2 {
    @Resource (name = "accountDao")
    private AccountDao accountDao;

    //    @Transactional (isolation = Isolation.READ_UNCOMMITTED)
//    @Transactional (timeout = 10)
//    @Transactional (readOnly = true)
//    @Transactional (rollbackFor = RuntimeException.class)
    @Transactional (noRollbackFor = NullPointerException.class)
    public void insert (Account account) {
//        try {
//            Thread.sleep(1000 * 15);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        accountDao.insert(account);

//        throw new IOException();
//        throw new RuntimeException();
        throw new NullPointerException();

//        try {
//            Thread.sleep(1000 * 15);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
