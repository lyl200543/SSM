package com.lyl.mybatis.test;

import com.lyl.mybatis.mapper.logMapper;
import com.lyl.mybatis.pojo.log;
import com.lyl.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 *ClassName: logMapperTest
 *Package: com.lyl.mybatis.test
 *Description:创建于 2025/5/20 20:12
 *@Author lyl
 *@Version 1.0
 */
public class logMapperTest {
    @Test
    public void testSelectByDate () {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        logMapper mapper = sqlSession.getMapper(logMapper.class);
        List<log> logs = mapper.selectByDate("20250520");
        logs.forEach(log -> System.out.println(log));
    }
}
