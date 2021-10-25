package com.mx.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoServiceTest {
    @Test
    public void test(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoService userDaoService=applicationContext.getBean("userDaoService",UserDaoService.class);
        userDaoService.ServiceSay();
    }
}
