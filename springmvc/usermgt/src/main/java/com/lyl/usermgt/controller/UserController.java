package com.lyl.usermgt.controller;

import com.lyl.usermgt.dao.UserDao;
import com.lyl.usermgt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *ClassName: UserController
 *Package: com.lyl.usermgt.controller
 *Description:创建于 2025/7/26 17:33
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping ("/user")
    public String list (Model model) {
        List<User> users = userDao.selectAll();
        model.addAttribute("users" , users);
        return "user_list";
    }

    @PostMapping ("/user")
    public String save (User user) {
        userDao.add(user);
        return "redirect:/user";
    }

    @GetMapping ("/user/{id}")
    public String toEdit (@PathVariable ("id") Long id , Model model) {
        User user = userDao.selectById(id);
        model.addAttribute("user" , user);
        return "user_edit";
    }

    @PutMapping("/user")
    public String modify(User user){
        userDao.modify(user);
        return "redirect:/user";
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") Long id )
    {
        userDao.deleteById(id);
        return "redirect:/user";
    }
}
