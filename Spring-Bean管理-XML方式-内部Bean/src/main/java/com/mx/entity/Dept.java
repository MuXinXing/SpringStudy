package com.mx.entity;

/**
 * @author MX
 * @create 2021/6/27 21:19
 */
public class Dept {
    private String Dept;

    public Dept(String dept) {
        Dept = dept;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "Dept='" + Dept + '\'' +
                '}';
    }
}
