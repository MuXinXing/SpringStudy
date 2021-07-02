package com.mx.entity;

/**
 * @author MX
 * @create 2021/6/29 13:18
 */
public class User {
    private String name;
    private Integer age;
    private Dept dept;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                '}';
    }
}
