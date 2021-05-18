package com.udemy.backendninja.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

    private String name;
    private Integer age;

    public Person(){

    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
