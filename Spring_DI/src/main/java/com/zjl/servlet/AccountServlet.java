package com.zjl.servlet;

import com.zjl.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AccountServlet {
    public static void main(String[] args) {
        //创建核心对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.saveAccount();

    }
}
