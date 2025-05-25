package org.god.batis.core;

import java.sql.Connection;

/**
 *ClassName: ManagedTransaction
 *Package: org.god.batis.core
 *Description:创建于 2025/5/24 20:44
 *@Author lyl
 *@Version 1.0
 */
public class ManagedTransaction implements Transaction {
    @Override
    public void commit () {

    }

    @Override
    public void rollback () {

    }

    @Override
    public void close () {

    }

    @Override
    public void openConnection () {

    }

    @Override
    public Connection getConnection () {
        return null;
    }
}
