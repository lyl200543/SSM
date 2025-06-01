package com.lyl.spring6.biz;

import org.springframework.stereotype.Service;

/**
 *ClassName: UserService
 *Package: com.lyl.spring6.biz
 *Description:创建于 2025/6/1 16:41
 * 需求是这样的:项目开发结束了，已经上线了。运行正常
 * 客户提出了新的需求:凡事在系统中进行修改操作的，删除操作的，新增操作的
 * 都要把这个人记录下来。因为这几个操作是属于危险行为
 *@Author lyl
 *@Version 1.0
 */
@Service
public class UserService {
    public void insertUser () {
        System.out.println("新增用户操作...");
    }

    public void deleteUser () {
        System.out.println("删除用户操作...");
    }

    public void updateUser () {
        System.out.println("更新用户操作...");
    }

    public void selectUser () {
        System.out.println("查询用户操作...");
    }

}
