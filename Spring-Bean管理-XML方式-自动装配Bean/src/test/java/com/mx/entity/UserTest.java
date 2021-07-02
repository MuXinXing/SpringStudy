package com.mx.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MX
 * @create 2021/6/29 13:23
 */
public class UserTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=applicationContext.getBean("user",User.class);
        System.out.println(user);
    }

/*    @Test
    public void test2(){
        int b[][]={{1},{2,2},{2,2,2}};
        int sum=1;
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                sum*=b[i][j];
            }
        }
        System.out.println(sum);
    }*/
}
