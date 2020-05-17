package com.blueSky.dubbo.controller;

import api.domain.Student;
import api.service.StudentService;
import com.alibaba.dubbo.config.ProtocolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/student/list")
    public List<Student> studentList(){
       return studentService.listStudent();
    }

}
