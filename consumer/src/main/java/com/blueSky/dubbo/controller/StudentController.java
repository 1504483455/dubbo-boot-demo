package com.blueSky.dubbo.controller;

import api.domain.Student;
import api.service.StudentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * ****************************
 *
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/13
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @HystrixCommand(fallbackMethod="execException")
    @RequestMapping(value = "/student/list",method = RequestMethod.GET)
    public List<Student> studentList(){
       return studentService.listStudent();
    }

    public List<Student> execException(){
        System.out.println("-------------->");
        return Arrays.asList(new Student("error","四点"));
    }
}
