package org.example.demo_spring.controller;

import org.example.demo_spring.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*

        STATUS CODE:
        200  -  SUCCESS
        400  -  CLIENT SIDE ERROR
        500  -  SERVER SIDE ERROR



 */

@RestController
public class TestController {

    @GetMapping("/")
    public String testGet()
    {
        return "hello, this is spring boot";
    }

    //testfetch
    @GetMapping("/testpathvariable/{name}/{city}")
    public String testPathVariable(@PathVariable String name, @PathVariable String city)
    {
        System.out.println("name "+name);
        return "hello, this is spring boot, testFetch, name = "+name+", city "+city;
    }

    @GetMapping("/testparam")
    public String testParam(@RequestParam String name, @RequestParam String city)
    {
        System.out.println("name "+name);
        return "hello, this is spring boot, testFetch, name = "+name+", city "+city;
    }

    @GetMapping("/testparamsingle")
    public String testParamSingle(@RequestParam String name)
    {
        System.out.println("name "+name);
        return "hello, this is spring boot, testFetch, name = "+name;
    }

    @GetMapping("/testgetrequestbody")
    @ResponseBody
    public String testRequestBody(@RequestBody Student student)
    {
        System.out.println("student name "+student.getName());
        return "hello, this is spring boot, testFetch, student name = "+student.getName();
    }

    @PostMapping("/testgetrequestbodypost")
    public String testRequestBodyPost(@RequestBody Student student)
    {
        System.out.println("student name "+student.getName());
        return "hello, this is spring boot, testFetch, student name = "+student.getName()+", city "+student.getCity();
    }

    @GetMapping("/testreturnobject")
    //@ResponseBody // compulsory with @Controller
    public Student testReturnObject()
    {
        Student student = new Student();
        return student;
    }

    @GetMapping("/testresponseentity")
    public ResponseEntity<Student> testResponseEntity()
    {
        Student student = new Student();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(student);
    }

}
