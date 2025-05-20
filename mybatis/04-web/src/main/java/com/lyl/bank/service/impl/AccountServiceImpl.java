package com.lyl.bank.service.impl;

import com.lyl.bank.dao.AccountDao;
import com.lyl.bank.exceptions.balanceNotEnoughException;
import com.lyl.bank.exceptions.transferException;
import com.lyl.bank.pojo.Account;
import com.lyl.bank.service.AccountService;
import com.lyl.bank.util.SqlSessionUtil;
import com.lyl.bank.util.generateDaoProxy;
import org.apache.ibatis.session.SqlSession;

/**
 *ClassName: AccountServiceImpl
 *Package: com.lyl.bank.service.impl
 *Description:创建于 2025/5/19 10:10
 *@Author lyl
 *@Version 1.0
 */

public class AccountServiceImpl implements AccountService {
    //private AccountDao dao = new AccountDaoImpl();

    //使⽤mybatis获取dao接⼝代理类对象
    //private AccountDao dao = SqlSessionUtil.openSession().getMapper(AccountDao.class);

    //自定义代理类
    //private AccountDao dao = (AccountDao) generateDaoProxy.generate(SqlSessionUtil.openSession() , AccountDao.class);
    private AccountDao dao = generateDaoProxy.generate(SqlSessionUtil.openSession() , AccountDao.class);

    @Override
    public void transfer (String fromAct , String toAct , double money) throws balanceNotEnoughException, transferException {
        //开启事务
        SqlSession sqlSession = SqlSessionUtil.openSession();

        //1.判断转出账户余额是否充足（select）
        Account act1 = dao.selectByAct(fromAct);
        if (act1.getBalance() < money) {
            throw new balanceNotEnoughException("余额不足");
        }

        //2.若余额充足，则更新账户的余额（update）
        Account act2 = dao.selectByAct(toAct);
        act1.setBalance(act1.getBalance() - money);
        int ret = dao.update(act1);

        //模拟异常-->开启事务
//        String str = null;
//        System.out.println(str.toString());

        act2.setBalance(act2.getBalance() + money);
        ret += dao.update(act2);
        if (ret != 2) {
            throw new transferException("不明原因，转账失败");
        }

        sqlSession.commit();
        SqlSessionUtil.close();
    }
}
