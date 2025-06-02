package com.lyl.bank.service.impl;

import com.lyl.bank.dao.AccountDao;
import com.lyl.bank.pojo.Account;
import com.lyl.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *ClassName: AccountServiceImpl2
 *Package: com.lyl.bank.service.impl
 *Description:创建于 2025/6/2 13:38
 *@Author lyl
 *@Version 1.0
 */
@Service ("accountService2")
public class AccountServiceImpl2 implements AccountService {
    @Override
    public void transfer (String fromAct , String toAct , double money) {

    }

    @Resource (name = "accountDao")
    private AccountDao accountDao;

    @Override
    @Transactional (propagation = Propagation.REQUIRES_NEW)
    public void save (Account account) {
        accountDao.insert(account);
        String str = null;
        str.toString();
    }
}
