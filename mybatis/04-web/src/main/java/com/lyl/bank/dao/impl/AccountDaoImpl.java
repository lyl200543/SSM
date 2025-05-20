package com.lyl.bank.dao.impl;

import com.lyl.bank.dao.AccountDao;
import com.lyl.bank.pojo.Account;
import com.lyl.bank.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 *ClassName: AccountDaoImpl
 *Package: com.lyl.bank.dao.impl
 *Description:创建于 2025/5/19 10:20
 *@Author lyl
 *@Version 1.0
 */

/**
 改进：dao实现类的代码重复且简单，是否可以自动生成
        --》使用javassist(mybatis内置了)
 */
public class AccountDaoImpl implements AccountDao {
    @Override
    public Account selectByAct (String act) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        Account account = (Account) sqlSession.selectOne("Account.selectByAct" , act);
        return account;
    }

    @Override
    public int update (Account act) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        int ret = sqlSession.update("Account.updateByAct" , act);
        return ret;
    }
}
