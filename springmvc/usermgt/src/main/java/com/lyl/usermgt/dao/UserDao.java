package com.lyl.usermgt.dao;

import com.lyl.usermgt.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 *ClassName: UserDao
 *Package: com.lyl.usermgt.dao
 *Description:创建于 2025/7/26 17:36
 *@Author lyl
 *@Version 1.0
 */
@Repository
public class UserDao {
    private static List<User> users = new ArrayList<>();

    static {
        User user1 = new User(10001L , "张三" , "zhangsan@powernode.com" , 1);
        User user2 = new User(10002L , "李四" , "lisi@powernode.com" , 1);
        User user3 = new User(10003L , "王五" , "wangwu@powernode.com" , 1);
        User user4 = new User(10004L , "赵六" , "zhaoliu@powernode.com" , 0);
        User user5 = new User(10005L , "钱七" , "qianqi@powernode.com" , 0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public List<User> selectAll () {
        return users;
    }

    public void add (User user) {
        Long newId = 10001L;
        for (int i = 0 ; i < users.size() ; i++) {
            Long id = users.get(i).getId();
            if (id > newId)
                newId = id;
        }
        user.setId(newId + 1);
        users.add(user);
    }

    public User selectById (Long id) {
        int i;
        for (i = 0; i < users.size() ; i++) {
            if (users.get(i).getId().equals(id))
                break;
        }
        return users.get(i);

    }

    public void modify (User user) {
        for (int i = 0 ; i < users.size() ; i++) {
            if (users.get(i).getId().equals(user.getId())) {
                users.set(i , user);
                break;
            }
        }
    }

    public void deleteById (Long id) {
        for (int i = 0 ; i < users.size() ; i++) {
            if (users.get(i).getId().equals(id)) {
                users.remove(i);
                return;
            }
        }
    }
}
