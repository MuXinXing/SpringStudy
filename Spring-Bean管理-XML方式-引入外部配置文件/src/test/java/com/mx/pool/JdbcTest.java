package com.mx.pool;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MX
 * @create 2021/7/2 15:47
 */
public class JdbcTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcConnection jdbcConnection=applicationContext.getBean("jdbcConnection",JdbcConnection.class);
        System.out.println(jdbcConnection);
    }
}
