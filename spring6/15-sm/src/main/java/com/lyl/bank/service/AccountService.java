package com.lyl.bank.service;

import com.lyl.bank.pojo.Account;

import java.util.List;

/**
 *ClassName: AccountService
 *Package: com.lyl.bank.service
 *Description:创建于 2025/6/2 17:44
 *@Author lyl
 *@Version 1.0
 */
public interface AccountService {
    int save (Account account);

    int deleteByAct (String actno);

    int modify (Account account);

    Account getByAct (String actno);

    List<Account> getAll ();

    void transfer (String fromAct , String toAct , double money);
}
