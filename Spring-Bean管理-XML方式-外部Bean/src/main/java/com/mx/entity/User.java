package com.mx.entity;

/**
 * @author MX
 * @create 2021/6/27 21:44
 */
public class User {
    private String name;
    private Dept dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
