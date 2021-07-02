package com.mx.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author MX
 * @create 2021/6/20 15:47
 */
public class UserServiceTest {

    @Test
    public void UserBeanFactory(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
        //IOC BeanFactory实现方式
        //BeanFactory是Spring内部使用的接口，一般不提供给开发人员使用
        //特点是加载xml配置文件时不会创建对象，在getBean获取对象时才会创建对象
        User user=(User) beanFactory.getBean("user");
        user.say();
    }
    @Test
    public void UserApplicationContext(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //IOC ApplicationContext实现方式:
        // ApplicationContext接口读取xml配置文件中的bean，是BeanFactory的子接口，提供更多的功能，提供给开发人员使用
        //特点是加载配置文件时会加载配置文件中所有对象
        User user= (User) applicationContext.getBean("user");
        user.say();
    }

    @Test
    public void UserClassPathXmlApplicationContext(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //ClassPathXmlApplicationContext用于加载当前项目目录中(相对路径)的xml配置文件,创建IOC容器
        User user= (User) applicationContext.getBean("user");
        user.say();
    }

    @Test
    public void UserFileFileSystemXmlApplicationContext(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\MX\\Desktop\\Java\\IDEA项目\\Spring\\Spring框架基础\\Spring-IOC实现\\src\\main\\resources\\applicationContext.xml");
        //FileSystemXmlApplicationContext用于在绝对路径中加载xml配置文件，创建IOC容器
        User user= (User) applicationContext.getBean("user");
        user.say();
    }
}
