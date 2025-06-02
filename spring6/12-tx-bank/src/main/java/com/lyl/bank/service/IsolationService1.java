package com.lyl.bank.service;

import com.lyl.bank.dao.AccountDao;
import com.lyl.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.callback.Callback;

/**
 *ClassName: IsolationService1
 *Package: com.lyl.bank.service
 *Description:创建于 2025/6/2 14:17
 *@Author lyl
 *@Version 1.0
 */
@Service ("i1")
public class IsolationService1 {
    @Resource (name = "accountDao")
    private AccountDao accountDao;

    //    @Transactional (isolation = Isolation.READ_COMMITTED)
//    @Transactional (readOnly = true)
    @Transactional (rollbackFor = NullPointerException.class)
    public void getByActno (String actno) {
        Account act = accountDao.select(actno);
        System.out.println("查询到的账户信息：" + act);


    }
}
