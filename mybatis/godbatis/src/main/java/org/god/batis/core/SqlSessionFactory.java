package org.god.batis.core;

import java.util.Map;

/**
 *ClassName: SqlSessionFactory
 *Package: org.god.batis.core
 *Description:创建于 2025/5/24 20:29
 *@Author lyl
 *@Version 1.0
 */
public class SqlSessionFactory {

    private Transaction transaction;

    private Map<String, MappedStatement> mappedStatements;


    public SqlSession openSession () {
        transaction.openConnection();
        SqlSession sqlSession = new SqlSession(this);
        return sqlSession;
    }

    public SqlSessionFactory () {
    }

    public SqlSessionFactory (Transaction transaction , Map<String, MappedStatement> mappedStatements) {
        this.transaction = transaction;
        this.mappedStatements = mappedStatements;
    }

    public Transaction getTransaction () {
        return transaction;
    }

    public void setTransaction (Transaction transaction) {
        this.transaction = transaction;
    }

    public Map<String, MappedStatement> getMappedStatements () {
        return mappedStatements;
    }

    public void setMappedStatements (Map<String, MappedStatement> mappedStatements) {
        this.mappedStatements = mappedStatements;
    }

    @Override
    public String toString () {
        return "SqlSessionFactory{" +
                "transaction=" + transaction +
                ", mappedStatements=" + mappedStatements +
                '}';
    }
}
