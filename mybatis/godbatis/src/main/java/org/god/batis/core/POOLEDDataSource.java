package org.god.batis.core;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 *ClassName: POOLEDDataSource
 *Package: org.god.batis.core
 *Description:创建于 2025/5/24 20:53
 *@Author lyl
 *@Version 1.0
 */
public class POOLEDDataSource implements DataSource {
    @Override
    public Connection getConnection () throws SQLException {
        return null;
    }

    @Override
    public Connection getConnection (String username , String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter () throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter (PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout (int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout () throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger () throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap (Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor (Class<?> iface) throws SQLException {
        return false;
    }
}
