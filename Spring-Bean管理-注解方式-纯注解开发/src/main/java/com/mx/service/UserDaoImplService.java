package com.mx.service;

import com.mx.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author MX
 * @create 2021/10/15 10:38
 */
@Service
public class UserDaoImplService {
    @Resource
    private UserDao userDao;
    //自动注入
    public void ServiceSay(){
        System.out.println("ServiceSay....");
        userDao.say();
    }
}
