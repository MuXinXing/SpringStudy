package com.mx.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MX
 * @create 2021/7/2 16:23
 */
public class FactoryBeanTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        FactoryBeans factoryBeans=applicationContext.getBean("standardsBean",FactoryBeans.class);
        //standardsBean是一个基本bean，然后进行类型转换后将基本bean转换成FactoryBeans类型(FactoryBean中getObject中返回的类型)
        System.out.println(factoryBeans);
    }
}
