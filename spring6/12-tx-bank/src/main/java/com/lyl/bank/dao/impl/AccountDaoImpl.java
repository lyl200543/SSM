package com.lyl.bank.dao.impl;

import com.lyl.bank.dao.AccountDao;
import com.lyl.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *ClassName: AccountDaoImpl
 *Package: com.lyl.bank.dao.impl
 *Description:创建于 2025/6/1 19:37
 *@Author lyl
 *@Version 1.0
 */
@Repository ("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Resource (name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account select (String actno) {
        String sql = "select * from t_act where actno=?";
        Account account = jdbcTemplate.queryForObject(sql , new BeanPropertyRowMapper<>(Account.class) , actno);
        return account;
    }

    @Override
    public int update (Account account) {
        String sql = "update t_act set balance=? where actno=? ";
        int ret = jdbcTemplate.update(sql , account.getBalance() , account.getActno());
        return ret;
    }

    @Override
    public int insert (Account account) {
        String sql = "insert into t_act values(?,?)";
        return jdbcTemplate.update(sql , account.getActno() , account.getBalance());
    }
}
