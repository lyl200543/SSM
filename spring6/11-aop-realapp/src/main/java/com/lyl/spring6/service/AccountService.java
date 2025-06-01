package com.lyl.spring6.service;

import org.springframework.stereotype.Service;

/**
 *ClassName: AccountService
 *Package: com.lyl.spring6.service
 *Description:创建于 2025/6/1 16:31
 * 业务类中的每一个业务方法都是需要控制事务的，而控制事务的代码又是固定的格式
 * 控制事务的代码就是和业务逻辑没有关系的“交叉业务”
 * 交叉业务的代码没有得到复用，并且如果这些交叉业务代码需要修改，那必然需要修改多处，难维护
 * 怎么解决?可以采用AOP思想解决
 * 可以把以上控制事务的代码作为环绕通知，切入到目标类的方法当中
 *@Author lyl
 *@Version 1.0
 */
@Service
public class AccountService {
    public void thransfer () {
        System.out.println("账户正在转账...");
    }

    public void withdraw () {
        System.out.println("账户正在取款...");
        throw new RuntimeException();
    }
}
