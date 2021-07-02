package com.mx.service;

import com.mx.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

/**
 * @author MX
 * @create 2021/6/20 16:48
 */
public class UserServiceTest {
    @Test
    public void UserBeanTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User)applicationContext.getBean("user");
        user.say();
        HashMap hashMap=new HashMap();
    }
}
