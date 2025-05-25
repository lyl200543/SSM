package org.god.batis.core;

/**
 *ClassName: MappedStatement
 *Package: org.god.batis.core
 *Description:创建于 2025/5/24 20:34
 * 普通的java类。POJ0，封装了一个SQL标签。
 * 一个Mappedstatement对象对应一个SQL标签
 * 一个SQL标签中的所有信息封装到appedstatement对象当中。
 *@Author lyl
 *@Version 1.0
 */
public class MappedStatement {
    private String sql;
    private String returnType;

    public MappedStatement (String sql , String returnType) {
        this.sql = sql;
        this.returnType = returnType;
    }

    public MappedStatement () {
    }

    public String getSql () {
        return sql;
    }

    public void setSql (String sql) {
        this.sql = sql;
    }

    public String getReturnType () {
        return returnType;
    }

    public void setReturnType (String returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString () {
        return "MappedStatement{" +
                "sql='" + sql + '\'' +
                ", returnType='" + returnType + '\'' +
                '}';
    }
}
