package com.mx.Service;

import com.mx.config.SpringConfig;
import com.mx.service.UserDaoImplService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author MX
 * @create 2021/10/15 10:50
 */
public class ServiceTest {
    @Test
    public void Test(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        //AnnotationConfigApplicationContext类用于加载配置类的class文件
        UserDaoImplService userDaoImplService=applicationContext.getBean("userDaoImplService",UserDaoImplService.class);
        //idea使用配置类作为spring配置时，getBean方法不会高亮bean名，不影响程序
        userDaoImplService.ServiceSay();
    }
}
