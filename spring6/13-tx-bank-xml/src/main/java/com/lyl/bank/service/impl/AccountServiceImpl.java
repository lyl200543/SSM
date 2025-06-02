package com.lyl.bank.service.impl;

import com.lyl.bank.dao.AccountDao;
import com.lyl.bank.pojo.Account;
import com.lyl.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *ClassName: AccountServiceImpl
 *Package: com.lyl.bank.service.impl
 *Description:创建于 2025/6/1 19:51
 *@Author lyl
 *@Version 1.0
 */
//@Transactional    //代表类中所有类都加上事务控制
@Service ("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource (name = "accountDao")
    private AccountDao accountDao;

    @Override
    public void transfer (String fromAct , String toAct , double money) {
        Account act1 = accountDao.select(fromAct);
        if (act1.getBalance() < money)
            throw new RuntimeException("转出账户余额不足");

        Account act2 = accountDao.select(toAct);
        act1.setBalance(act1.getBalance() - money);
        act2.setBalance(act2.getBalance() + money);

        int count = accountDao.update(act1);

        //模拟异常
//        String str = null;
//        str.toString();

        count += accountDao.update(act2);

        if (count != 2)
            throw new RuntimeException("转账失败，原因未知");
    }

}
