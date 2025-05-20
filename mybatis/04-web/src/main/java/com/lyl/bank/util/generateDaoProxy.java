package com.lyl.bank.util;

import org.apache.ibatis.javassist.ClassPool;
import org.apache.ibatis.javassist.CtClass;
import org.apache.ibatis.javassist.CtMethod;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *ClassName: generateDaoProxy
 *Package: com.lyl.bank.util
 *Description:创建于 2025/5/20 14:59
 *工具类：在内存中动态创建传入接口的实现类，并返回实例化对象
 *@Author lyl
 *@Version 1.0
 */
public class generateDaoProxy {
    public static <T> T generate (SqlSession sqlSession , Class<T> daoInterface) {
        //获取类池
        ClassPool pool = ClassPool.getDefault();
        //制造接口
        //com.lyl.bank.dao.AccountDao
        CtClass ctInterface = pool.makeInterface(daoInterface.getName());
        //制造类
        CtClass ctClass = pool.makeClass(daoInterface.getName() + "Proxy");
        //实现接口
        ctClass.addInterface(ctInterface);
        //实现接口中的所有方法
        Method[] methods = daoInterface.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> {
            //拼接方法
            //public Account selectByAct (String act);
            StringBuilder methodCode = new StringBuilder();
            methodCode.append("public");
            methodCode.append(" ");
            methodCode.append(method.getReturnType().getName());
            methodCode.append(" ");
            methodCode.append(method.getName());
            methodCode.append("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0 ; i < parameterTypes.length ; i++) {
                methodCode.append(parameterTypes[i].getName());
                methodCode.append(" ");
                methodCode.append("arg" + i);
                if (i != parameterTypes.length - 1) {
                    methodCode.append(",");
                }
            }
            methodCode.append(")");
            methodCode.append("{");
            //类要使用全类名
            methodCode.append("org.apache.ibatis.session.SqlSession sqlSession = com.lyl.bank.util.SqlSessionUtil.openSession();");
            //既然我框架开发者不知道sqLId，怎么办呢?mybatis框架的开发者于是就出台了一个规定:凡是使用GenerateDaoProxy机制的。
            //sqLId都不能随便写。namespace必须是dao接口的全限定名称。id必须是dao接口中方法名。
            String sqlId = daoInterface.getName() + "." + method.getName();
            SqlCommandType sqlCommandType = sqlSession.getConfiguration().getMappedStatement(sqlId).getSqlCommandType();
            //Account account = (Account) sqlSession.selectOne("Account.selectByAct" , act);
            if (sqlCommandType == SqlCommandType.INSERT) {

            }
            if (sqlCommandType == SqlCommandType.DELETE) {

            }
            if (sqlCommandType == SqlCommandType.UPDATE) {
                methodCode.append("return sqlSession.update(\"" + sqlId + "\" , arg0);");
            }
            if (sqlCommandType == SqlCommandType.SELECT) {
                methodCode.append("return (" + method.getReturnType().getName() + ")sqlSession.selectOne(\"" + sqlId + "\" , arg0);");
            }
            methodCode.append("}");
            try {
                CtMethod ctMethod = CtMethod.make(methodCode.toString() , ctClass);
                ctClass.addMethod(ctMethod);
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        //创建对象
//        Object object = null;
//        try {
//            Class<?> aClass = ctClass.toClass();
//            object = aClass.newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return object;

        T object = null;
        try {
            Class aClass = ctClass.toClass();
            object = (T) aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
