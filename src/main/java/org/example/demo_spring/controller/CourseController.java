package org.example.demo_spring.controller;

import org.example.demo_spring.model.Course;
import org.example.demo_spring.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController
{

    @PostMapping("/create")
    public ResponseEntity<Course> createCourse(@RequestBody Course course)
    {
        System.out.println("inside createCourse");
        return ResponseEntity.ok(course);
    }

}
