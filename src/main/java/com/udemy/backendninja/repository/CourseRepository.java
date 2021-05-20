package com.udemy.backendninja.repository;

import com.udemy.backendninja.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course, Integer> {

    public Course findByPrice(Integer price);
    public Course findByPriceAndName(Integer price, String name);
    public Course findByNameOrderByPrice (String name);
    public Course findByNameOrPrice (String name, Integer price);
}
