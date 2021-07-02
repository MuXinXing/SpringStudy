package com.mx.entity;

/**
 * @author MX
 * @create 2021/6/26 17:26
 */
public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    //使用有参构造方法注入


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
