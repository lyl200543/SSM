package com.lyl.bank.service.impl;

import com.lyl.bank.mapper.AccountMapper;
import com.lyl.bank.pojo.Account;
import com.lyl.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *ClassName: AccountServiceImpl
 *Package: com.lyl.bank.service.impl
 *Description:创建于 2025/6/2 17:46
 *@Author lyl
 *@Version 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int save (Account account) {
        return accountMapper.insert(account);
    }

    @Override
    public int deleteByAct (String actno) {
        return accountMapper.delete(actno);
    }

    @Override
    public int modify (Account account) {
        return accountMapper.update(account);
    }

    @Override
    public Account getByAct (String actno) {
        return accountMapper.selectByAct(actno);
    }

    @Override
    public List<Account> getAll () {
        return accountMapper.selectAll();
    }

    @Override
    public void transfer (String fromAct , String toAct , double money) {
        Account act1 = accountMapper.selectByAct(fromAct);
        if (act1.getBalance() < money)
            throw new RuntimeException("余额不足");
        Account act2 = accountMapper.selectByAct(toAct);
        act1.setBalance(act1.getBalance() - money);
        act2.setBalance(act2.getBalance() + money);
        int count = accountMapper.update(act1);
        count += accountMapper.update(act2);
        if (count != 2)
            throw new RuntimeException("转账失败，原因未知");
    }
}
