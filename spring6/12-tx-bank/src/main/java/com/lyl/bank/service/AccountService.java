package com.lyl.bank.service;

import com.lyl.bank.pojo.Account;

/**
 *ClassName: AccountService
 *Package: com.lyl.bank.service
 *Description:创建于 2025/6/1 19:50
 *@Author lyl
 *@Version 1.0
 */
public interface AccountService {
    void transfer (String fromAct , String toAct , double money);

    void save (Account account);

}
