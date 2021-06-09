package com.udemy.backendninja.controller;

import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.service.CourseService;
import com.udemy.backendninja.utils.constants.ViewConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    @Qualifier("courseServiceImpl")
    private CourseService courseService;

    @Autowired
    @Qualifier("modelAndView")
    private ModelAndView modelAndView;

    @GetMapping("/getcourses")
    public ModelAndView getAllCourses() {
        modelAndView.setViewName(ViewConstants.COURSES_VIEW);
        //Devuelve los cursos en la vista
        modelAndView.addObject("courses", courseService.getAllCourses());
        //Permite a Thymeleaf trabajar con un objeto Course vacío para poderlo rellenar en la vista
        modelAndView.addObject("course", new Course());
        return modelAndView;
    }

    @PostMapping("/addcourse")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

}
