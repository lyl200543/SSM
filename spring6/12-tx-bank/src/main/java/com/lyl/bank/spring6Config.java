package com.lyl.bank;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 *ClassName: spring6Config
 *Package: com.lyl.bank
 *Description:创建于 2025/6/2 15:06
 *@Author lyl
 *@Version 1.0
 */
@Configuration
@ComponentScan ("com.lyl.bank")
@EnableTransactionManagement
public class spring6Config {
    @Bean (name = "ds")
    public DruidDataSource getDruidDataSource () {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/spring6");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        return druidDataSource;
    }

    @Bean (name = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate (DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate .setDataSource(getDruidDataSource());
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean (name = "transactionManager")
    public DataSourceTransactionManager getDataSourceTransactionManager (DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
