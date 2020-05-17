package com.blueSky.dubbo.service.impl;

import api.domain.Student;
import api.domain.StudentClass;
import api.service.StudentClassService;
import api.service.StudentService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * ****************************
 *(loadbalance = "myLoadBalance")
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/12
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Reference(loadbalance = "myLoadBalance")
    private StudentClassService studentClassService;

    @Override
    public List<Student> listStudent() {
        List<Student> students = new ArrayList<>();
        List<StudentClass> studentClasses = studentClassService.listStudentClass("1");
        Student student = new Student();
        student.setAge(52);
        student.setName("小张丹");
        student.setStudentNo("1");
        student.setStudentClassList(studentClasses);
        student.setUuid(UUID.randomUUID().toString());
        students.add(student);
        return students;
    }

}
