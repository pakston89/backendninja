package com.udemy.backendninja.service;

import com.udemy.backendninja.entity.Course;
import java.util.List;

public interface CourseService {

    public List<Course> getAllCourses();
    public void addCourse(Course course);
    public void removeCourse(Integer id);
    public void updateCourse(Course course);
}
