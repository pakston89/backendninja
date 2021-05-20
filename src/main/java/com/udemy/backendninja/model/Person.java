package com.udemy.backendninja.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@ToString
public class Person {

    @NotNull
    private String name;
    @NotNull
    private Integer age;

    public Person(){

    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
