package com.lyl.spring6.bean4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 *ClassName: MyDataSource
 *Package: com.lyl.spring6.bean4
 *Description:创建于 2025/5/31 10:49
 *@Author lyl
 *@Version 1.0
 */
@Component
public class MyDataSource implements DataSource {
    @Value ("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value ("mysql:jdbc://localhost:3306/spring")
    private String url;
    @Value ("root")
    private String username;
    @Value ("123456")
    private String password;


//    public MyDataSource (@Value ("com.mysql.cj.jdbc.Driver") String driver ,
//                         @Value ("mysql:jdbc://localhost:3306/spring") String url ,
//                         @Value ("root") String username ,
//                         @Value ("123456") String password) {
//        this.driver = driver;
//        this.url = url;
//        this.username = username;
//        this.password = password;
//    }


    //    @Value ("com.mysql.cj.jdbc.Driver")
//    public void setDriver (String driver) {
//        this.driver = driver;
//    }
//
//    @Value ("mysql:jdbc://localhost:3306/spring")
//    public void setUrl (String url) {
//        this.url = url;
//    }
//
//    @Value ("root")
//    public void setUsername (String username) {
//        this.username = username;
//    }
//
//    @Value ("123456")
//    public void setPassword (String password) {
//        this.password = password;
//    }

    @Override
    public String toString () {
        return "MyDataSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
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
    public <T> T unwrap (Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor (Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public Logger getParentLogger () throws SQLFeatureNotSupportedException {
        return null;
    }
}
