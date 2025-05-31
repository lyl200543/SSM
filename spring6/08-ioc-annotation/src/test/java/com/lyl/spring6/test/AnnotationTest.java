package com.lyl.spring6.test;

import cn.lyl.spring6.Service.WorkerService;
import cn.lyl.spring6.springConfig;
import com.lyl.spring6.bean.Order;
import com.lyl.spring6.bean.Student;
import com.lyl.spring6.bean.User;
import com.lyl.spring6.bean.Vip;
import com.lyl.spring6.bean2.OrderDao;
import com.lyl.spring6.bean3.A;
import com.lyl.spring6.bean4.MyDataSource;
import org.junit.Test;
import org.lyl.spring6.Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *ClassName: AnnotationTest
 *Package: com.lyl.spring6.test
 *Description:创建于 2025/5/31 9:54
 *@Author lyl
 *@Version 1.0
 */
public class AnnotationTest {

    @Test
    public void testCompleteAnnotation () {
        ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
        WorkerService workerService = context.getBean("workerService" , WorkerService.class);
        workerService.delete();
    }

    @Test
    public void testResource () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-resource.xml");
        WorkerService workerService = applicationContext.getBean("workerService" , WorkerService.class);
        workerService.delete();
    }

    @Test
    public void testInjection2 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection.xml");
        StudentService studentService = applicationContext.getBean("studentService" , StudentService.class);
        studentService.save();
    }

    @Test
    public void testInjection () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource" , MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testChoose () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");
    }

    @Test
    public void test () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean" , User.class);
        System.out.println(userBean);
        Vip vipBean = applicationContext.getBean("vipBean" , Vip.class);
        System.out.println(vipBean);
        Order orderBean = applicationContext.getBean("order" , Order.class);
        System.out.println(orderBean);
        Student studentBean = applicationContext.getBean("student" , Student.class);
        System.out.println(studentBean);

        OrderDao od = applicationContext.getBean("od" , OrderDao.class);
        System.out.println(od);
    }
}
