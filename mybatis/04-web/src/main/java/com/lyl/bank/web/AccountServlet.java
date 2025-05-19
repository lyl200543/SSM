package com.lyl.bank.web;

import com.lyl.bank.exceptions.balanceNotEnoughException;
import com.lyl.bank.exceptions.transferException;
import com.lyl.bank.service.AccountService;
import com.lyl.bank.service.impl.AccountServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: AccountServlet
 *Package: com.lyl.bank.web
 *Description:创建于 2025/5/19 9:58
 *@Author lyl
 *@Version 1.0
 */
@WebServlet ("/transfer")
public class AccountServlet extends HttpServlet {
    //通常只需覆盖 doPost() 来处理 POST 请求
    //不要覆盖 service() 除非有特殊需求（如统一处理所有请求）,service()会调用doPost()等
    //如果错误地覆盖了 service() 而没有调用 super.service()，会导致 doPost() 等不会被调用

    AccountService accountService = new AccountServiceImpl();

    @Override
    protected void doPost (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        String fromAct = req.getParameter("fromAct");
        String toAct = req.getParameter("toAct");
        double money = Double.parseDouble(req.getParameter("money"));

        try {

            accountService.transfer(fromAct , toAct , money);
            resp.sendRedirect(req.getContextPath() + "/success.html");

        } catch (balanceNotEnoughException e) {
            resp.sendRedirect(req.getContextPath() + "/error1.html");
        } catch (transferException e) {
            resp.sendRedirect(req.getContextPath() + "/error2.html");
        } catch (Exception e) {
            resp.sendRedirect(req.getContextPath() + "/error2.html");
        }

    }
}
