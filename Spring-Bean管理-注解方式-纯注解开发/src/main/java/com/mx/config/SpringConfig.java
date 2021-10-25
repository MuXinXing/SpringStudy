package com.mx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author MX
 * @create 2021/10/15 10:36
 */
@Configuration//使用@Configuration注解声明类为配置类
@ComponentScan(basePackages = {"com.mx"})//使用@ComponentScan配置注解扫描路径，相当于在xml配置文件中开启注解扫描
public class SpringConfig {
}
