package com.mx.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MX
 * @create 2021/6/27 21:32
 */
public class UserTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
