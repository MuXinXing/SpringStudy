package com.mx.service;

import com.mx.pojo.User;
import org.junit.Test;

/**
 * @author MX
 * @create 2021/6/20 15:13
 */
public class UserFactory {

    public static User getUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String classValue=null;
        //通过dom4j解析xml文件后在加入到Class.forName中获取其.class文件
            Class clazz=Class.forName(classValue);
        return (User)clazz.newInstance();
    }

    @Test
    public void UserReflection() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        User user=getUser();
        user.say();
    }
}
