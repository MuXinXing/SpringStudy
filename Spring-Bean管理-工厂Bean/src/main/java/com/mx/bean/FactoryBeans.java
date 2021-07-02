package com.mx.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author MX
 * @create 2021/7/2 16:09
 */
public class FactoryBeans{
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "FactoryBeans{" +
                "str='" + str + '\'' +
                '}';
    }
}
