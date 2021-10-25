package com.mx.service;

import com.mx.dao.UserDao;
import com.mx.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author MX
 * @create 2021/10/14 20:20
 */
@Service
public class UserDaoService {
/*
    @Autowired
    //自动注入，根据属性类型进行注入，注入对象类型有或仅有一个，不建议使用，容易造成注入失败，
    //同时在新版idea中使用@Autowired会报warning警告不要使用(Filed)变量注入方式
    //尽量是使用构造器或set注入
//------------------------------------------------------------------------------------
    @Qualifier(value = "userDaoImpl")
    //根据属性名(bean名)进行注入，会自动查找value对应的属性名进行装配
    private UserDao userDao;
    */
//------------------------------------------------------------------------------------
/*    @Resource(name = "userDaoImpl")
    private UserDao userDao;
    //将userDaoImpl注入userDao*/
//------------------------------------------------------------------------------------
    @Resource(name = "secondDaoImpl")
    //当有多个相同类型的属性时，需要指定类型名进行注入，
    // 如此程序中有userDaoImpl/secondDaoImpl两个类实现UserDao,
    // 这时需要指定@Resource(name = "secondDaoImpl")类型名进行匹配注入
    private UserDao userDao;
//------------------------------------------------------------------------------------
/*
        @Resource(name="userDaoImpl")
        等价于
        UserDaoService(){
        userDao= new UserDaoImpl();
    }*/

    @Value(value = "MX")//指定值注入，将name默认值设为MX
    private String name;

    public void ServiceSay(){
        System.out.println("UserDaoService say...");
        System.out.println("@Value注入后的值为:"+name);
        userDao.say();
        //注入了userDaoImpl后的userDao调用userDaoImpl中重写的say方法
    }
}
