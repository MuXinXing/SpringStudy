package com.mx.entity;

/**
 * @author MX
 * @create 2021/6/29 13:18
 */
public class Dept {
    private String dept;

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dept='" + dept + '\'' +
                '}';
    }
}
