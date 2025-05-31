package org.lyl.spring6.Service;

import org.lyl.spring6.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *ClassName: Service
 *Package: org.lyl.spring6
 *Description:创建于 2025/5/31 11:13
 *@Author lyl
 *@Version 1.0
 */
@Service
public class StudentService {
    @Autowired
    @Qualifier ("studentDaoImplForMySQL")
    private StudentDao studentDao;


    //    @Autowired
//    public StudentService (@Autowired StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

    //    @Autowired
//    public void setStudentDao (StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

    public void save () {
        studentDao.insert();
    }
}
