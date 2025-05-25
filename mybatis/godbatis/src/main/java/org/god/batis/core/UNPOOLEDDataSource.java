package org.god.batis.core;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 *ClassName: UNPOOLEDDataSource
 *Package: org.god.batis.core
 *Description:创建于 2025/5/24 20:52
 *@Author lyl
 *@Version 1.0
 */
public class UNPOOLEDDataSource implements DataSource {
    private String url;
    private String username;
    private String password;

    public UNPOOLEDDataSource () {
    }

    public UNPOOLEDDataSource (String driver , String url , String username , String password) {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.url = url;
        this.username = username;
        this.password = password;
//        System.out.println(driver);
//        System.out.println(url);
//        System.out.println(username);
//        System.out.println(password);
    }

    @Override
    public Connection getConnection () throws SQLException {
        Connection connection = DriverManager.getConnection(url , username , password);
        return connection;
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
