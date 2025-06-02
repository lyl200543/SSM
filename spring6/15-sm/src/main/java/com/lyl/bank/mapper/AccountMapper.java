package com.lyl.bank.mapper;

import com.lyl.bank.pojo.Account;

import java.math.BigInteger;
import java.util.List;

/**
 *ClassName: AccountMapper
 *Package: com.lyl.bank.mapper
 *Description:创建于 2025/6/2 17:37
 *@Author lyl
 *@Version 1.0
 */
public interface AccountMapper {
    int insert (Account account);

    int delete (String actno);

    int update (Account account);

    Account selectByAct (String actno);

    List<Account> selectAll ();

}
