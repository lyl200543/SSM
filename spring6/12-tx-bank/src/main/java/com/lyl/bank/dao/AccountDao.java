package com.lyl.bank.dao;

import com.lyl.bank.pojo.Account;

/**
 *ClassName: AccountDao
 *Package: com.lyl.bank.dao
 *Description:创建于 2025/6/1 19:34
 *@Author lyl
 *@Version 1.0
 */
public interface AccountDao {
    Account select (String actno);

    int update (Account account);
}
