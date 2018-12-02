package com.itheima.test;

import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = ac.getBean("accountService", AccountService.class);
        service.saveAccount();
//        service.deleteAccount();
//        service.updateAccount(1);

    }
}
