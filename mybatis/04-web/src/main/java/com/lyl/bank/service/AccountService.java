package com.lyl.bank.service;

import com.lyl.bank.exceptions.balanceNotEnoughException;
import com.lyl.bank.exceptions.transferException;

/**
 *ClassName: AccountService
 *Package: com.lyl.bank.service
 *Description:创建于 2025/5/19 10:08
 *@Author lyl
 *@Version 1.0
 */
public interface AccountService {
    public void transfer (String fromAct , String toAct , double money) throws balanceNotEnoughException, transferException;
}
