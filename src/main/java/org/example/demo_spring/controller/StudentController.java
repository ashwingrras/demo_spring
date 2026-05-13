package org.example.demo_spring.controller;

import jakarta.validation.Valid;
import org.example.demo_spring.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController
{

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody @Valid Student student)
    {
        System.out.println("inside createStudent");
        return ResponseEntity.ok(student);
    }

}
