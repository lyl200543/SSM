package org.god.batis.core;

import java.sql.Connection;

/**
 *ClassName: Transaction
 *Package: org.god.batis.core
 *Description:创建于 2025/5/24 20:41
 *@Author lyl
 *@Version 1.0
 */
public interface Transaction {
    void commit ();

    void rollback ();

    void close ();

    void openConnection ();

    Connection getConnection ();
}
