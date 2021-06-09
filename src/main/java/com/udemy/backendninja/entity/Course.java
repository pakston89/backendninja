package com.udemy.backendninja.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Setter(AccessLevel.NONE)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "hours")
    private Integer hours;

    public Course() {
    }

    public Course(Integer id, String name, String description, Integer price, Integer hours) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.hours = hours;
    }
}
