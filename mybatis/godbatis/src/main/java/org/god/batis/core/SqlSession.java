package org.god.batis.core;

import com.sun.source.tree.BreakTree;

import java.lang.reflect.Method;
import java.nio.file.attribute.UserPrincipal;
import java.sql.*;

/**
 *ClassName: SqlSession
 *Package: org.god.batis.core
 *Description:创建于 2025/5/25 9:37
 *@Author lyl
 *@Version 1.0
 */
public class SqlSession {
    private SqlSessionFactory sqlSessionFactory;

    public SqlSession () {
    }

    public SqlSession (SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }


    //重中之重！！！！！！！！
    public int insert (String sqlId , Object pojo) {
        int count = 0;
        try {
            Connection connection = sqlSessionFactory.getTransaction().getConnection();
            //insert into t_user values(#{id},#{name},#{age})
            String batisSql = sqlSessionFactory.getMappedStatements().get(sqlId).getSql();
            //insert into t_user values(?,?,?)
            String sql = batisSql.replaceAll("#\\{[0-9a-zA-Z_$]*}" , "?");
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //不处理类型问题，一律setString()
            //问题：有几个? 每个?上传什么值
            int startIndex = 0;
            int index = 1;
            while (true) {
                try {
                    int jingIndex = batisSql.indexOf("#" , startIndex);
                    if (jingIndex < 0) {
                        break;
                    }
                    int youkuohaoIndex = batisSql.indexOf("}" , startIndex);
                    String property = batisSql.substring(jingIndex + 2 , youkuohaoIndex);

                    Class<?> aClass = pojo.getClass();
                    //getId()
                    String methodName = "get" + property.toUpperCase().charAt(0) + property.substring(1);
                    Method declaredMethod = aClass.getDeclaredMethod(methodName);
                    Object propertyValue = declaredMethod.invoke(pojo);

                    preparedStatement.setString(index , propertyValue.toString());
                    startIndex = youkuohaoIndex + 1;
                    index++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            count = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public Object selectOne (String sqlId , Object param) {
        Object ret = null;
        try {
            Connection connection = sqlSessionFactory.getTransaction().getConnection();
            //select * from t_user where id=#{id}
            MappedStatement mappedStatement = sqlSessionFactory.getMappedStatements().get(sqlId);
            String batisSql = mappedStatement.getSql();
            //select * from t_user where id=?
            String sql = batisSql.replaceAll("#\\{[0-9a-zA-Z_$]*}" , "?");
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1 , param.toString());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String returnType = mappedStatement.getReturnType();
                Class<?> aClass = Class.forName(returnType);
                ret = aClass.newInstance();
                ResultSetMetaData metaData = resultSet.getMetaData();
                int count = metaData.getColumnCount();
                for (int i = 0 ; i < count ; i++) {
                    //column是从1开始的
                    String columnName = metaData.getColumnName(i + 1);
                    String methodName = "set" + columnName.toUpperCase().charAt(0) + columnName.substring(1);
                    Method declaredMethod = aClass.getDeclaredMethod(methodName , String.class);
                    declaredMethod.invoke(ret , resultSet.getString(columnName));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

//    public static void main (String[] args) {
//        String sql = "insert into t_user values(#{id},#{name},#{age})";
//        int startIndex = 0;
//        int index = 1;
//        while (true) {
//            int jingIndex = sql.indexOf("#" , startIndex);
//            if (jingIndex < 0) {
//                break;
//            }
//            int youkuohaoIndex = sql.indexOf("}" , startIndex);
//            String property = sql.substring(jingIndex + 2 , youkuohaoIndex);
//            System.out.println(index);
//            System.out.println(property);
//            startIndex = youkuohaoIndex + 1;
//            index++;
//        }
//    }

    public void commit () {
        sqlSessionFactory.getTransaction().commit();
    }

    public void close () {
        sqlSessionFactory.getTransaction().close();
    }

    public void rollback () {
        sqlSessionFactory.getTransaction().rollback();
    }
}
