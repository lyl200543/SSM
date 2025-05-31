package com.lyl.spring6.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 *ClassName: MyDataSource
 *Package: com.lyl.spring6.jdbc
 *Description:创建于 2025/5/31 15:28
 *@Author lyl
 *@Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyDataSource implements DataSource {
    private String driver;
    private String url;
    private String username;
    private String password;

    @Override
    public Connection getConnection () throws SQLException {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url , username , password);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
