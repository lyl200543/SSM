package org.god.batis.core;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *ClassName: JDBCTransaction
 *Package: org.god.batis.core
 *Description:创建于 2025/5/24 20:44
 *@Author lyl
 *@Version 1.0
 */
public class JDBCTransaction implements Transaction {
    private DataSource dataSource;
    private boolean autoCommit;

    private Connection connection;

    public JDBCTransaction (DataSource dataSource , boolean autoCommit) {
        this.dataSource = dataSource;
        this.autoCommit = autoCommit;
    }


    @Override
    public void commit () {
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rollback () {
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close () {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void openConnection () {
        try {
            if (connection == null) {
                connection = dataSource.getConnection();
                connection.setAutoCommit(autoCommit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection () {
        return connection;
    }
}
