package com.mx.entity;

/**
 * @author MX
 * @create 2021/6/27 21:44
 */
public class Dept {
    private String dept;

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dept='" + dept + '\'' +
                '}';
    }
}
