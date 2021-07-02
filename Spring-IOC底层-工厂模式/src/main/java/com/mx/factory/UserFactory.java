package com.mx.factory;

import com.mx.pojo.User;

/**
 * @author MX
 */
public class UserFactory {
    public static User getUser(){
        return new User();
        //返回一个User对象，相当于User user = new User();
    }
}
