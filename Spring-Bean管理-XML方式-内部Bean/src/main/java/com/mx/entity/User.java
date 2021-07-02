package com.mx.entity;

/**
 * @author MX
 * @create 2021/6/27 21:19
 */
public class User {
    private Dept dept;
    private String name;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "dept=" + dept +
                ", name='" + name + '\'' +
                '}';
    }
}
