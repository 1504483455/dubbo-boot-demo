package com.blueSky.dubbo.service.impl;

import api.domain.Student;
import api.domain.StudentClass;
import api.service.StudentClassService;
import api.service.StudentService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ****************************
 * <p>
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/13
 */
@Service
@Component
public class StudentServiceImpl implements StudentService {

    @Reference
    private StudentClassService studentClassService;

    @Override
    public List<Student> listStudent() {
        List<Student> students = new ArrayList<>();
        List<StudentClass> studentClasses = studentClassService.listStudentClass("1");
        Student student = new Student();
        student.setAge(32);
        student.setName("小李四");
        student.setStudentNo("1");
        student.setStudentClassList(studentClasses);
        student.setUuid(UUID.randomUUID().toString());
        students.add(student);
        return students;
    }
}
