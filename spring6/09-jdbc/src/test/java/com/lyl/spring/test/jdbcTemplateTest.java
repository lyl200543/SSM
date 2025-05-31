package com.lyl.spring.test;

import com.lyl.spring6.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *ClassName: jdbcTemplateTest
 *Package: com.lyl.spring.test
 *Description:创建于 2025/5/31 15:38
 *@Author lyl
 *@Version 1.0
 */
public class jdbcTemplateTest {
    @Test
    public void testBatchInsert () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate" , JdbcTemplate.class);
        String sql = "insert into t_user(real_name,age) values(?,?)";
        Object[] objects1 = {"小明1" , 20};
        Object[] objects2 = {"小明2" , 21};
        Object[] objects3 = {"小明3" , 22};
        List<Object[]> list = new ArrayList<>();
        list.add(objects1);
        list.add(objects2);
        list.add(objects3);
        int[] arr = jdbcTemplate.batchUpdate(sql , list);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testSelectAll () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate" , JdbcTemplate.class);
        String sql = "select * from t_user";
        List<User> query = jdbcTemplate.query(sql , new BeanPropertyRowMapper<>(User.class));
        System.out.println(query);
    }

    @Test
    public void testSelectOne () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate" , JdbcTemplate.class);
        String sql = "select id,real_name,age from t_user where id=?";
        User user = jdbcTemplate.queryForObject(sql , new BeanPropertyRowMapper<>(User.class) , 1);
        System.out.println(user);
    }

    @Test
    public void testDelete () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate" , JdbcTemplate.class);
        String sql = "delete from t_user where id=?";
        int count = jdbcTemplate.update(sql , 3);
        System.out.println(count);
    }

    @Test
    public void testUpdate () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate" , JdbcTemplate.class);
        String sql = "update t_user set real_name= ?,age= ? where id= ?";
        int count = jdbcTemplate.update(sql , "小明" , 18 , 3);
        System.out.println(count);
    }

    @Test
    public void testInsert () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate" , JdbcTemplate.class);
        String sql = "insert into t_user(real_name,age) values(?,?)";
        int count = jdbcTemplate.update(sql , "王五" , 50);
        System.out.println(count);
    }

    @Test
    public void testJdbc () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate" , JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }
}
