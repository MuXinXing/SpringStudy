package com.mx.pojo;

import com.mx.factory.UserFactory;
import org.junit.Test;

/**
 * @author MX
 * @create 2021/6/20 14:49
 */
public class UserTest {
    @Test
    public void UserFactory(){
        User user=UserFactory.getUser();
        //调用User工厂的getUser方法返回一个User对象
        user.say();
    }

    @Test
    public void UserNew(){
        User user=new User();
        //等同于getUser中返回的User对象
        user.say();
    }
}
