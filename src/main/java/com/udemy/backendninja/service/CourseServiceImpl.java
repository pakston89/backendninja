package com.udemy.backendninja.service;

import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService {

    @Autowired
    @Qualifier("courseRepository")
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void removeCourse(Integer id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }
}
