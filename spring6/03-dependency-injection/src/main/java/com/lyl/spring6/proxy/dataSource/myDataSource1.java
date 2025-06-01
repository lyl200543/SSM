package com.lyl.spring6.proxy.dataSource;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 *ClassName: myDateSource1
 *Package: com.lyl.spring6.dateSource
 *Description:创建于 2025/5/28 9:11
 *@Author lyl
 *@Version 1.0
 */
public class myDataSource1 implements DataSource {
    private Properties properties;

    public void setProperties (Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString () {
        return "myDataSource1{" +
                "properties=" + properties +
                '}';
    }

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
