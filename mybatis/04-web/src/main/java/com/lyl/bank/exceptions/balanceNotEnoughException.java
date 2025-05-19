package com.lyl.bank.exceptions;

/**
 *ClassName: balanceNotEnough
 *Package: com.lyl.bank.exceptions
 *Description:创建于 2025/5/19 11:50
 *@Author lyl
 *@Version 1.0
 */
public class balanceNotEnoughException extends Exception {
    public balanceNotEnoughException () {

    }

    public balanceNotEnoughException (String msg) {
        super(msg);
    }
}
