package com.mx.entity;

import org.springframework.stereotype.Component;

/**
 * @author MX
 */
@Component(value = "person")
public class Person {
    private String personName;
    private String personPhone;

    public Person() {
        this.personName="MX";
        this.personPhone="12314";
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personPhone='" + personPhone + '\'' +
                '}';
    }
}
