package com.blueSky.dubbo.service.impl;

import api.domain.StudentClass;
import api.service.StudentClassService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ****************************
 *
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/13
 */
public class StudentClassServiceImpl implements StudentClassService {

    @Override
    public List<StudentClass> listStudentClass(String studentNo) {
        System.out.println("boot xml provider StudentClassServiceImpl listStudentClass......");
        List<StudentClass> studentClasses = new ArrayList<>();
        StudentClass studentClass = new StudentClass();
        studentClass.setAllTime(2000);
        studentClass.setName("xml调用课程");
        studentClass.setStudentNo("1");
        studentClass.setUuid(UUID.randomUUID().toString());
        studentClasses.add(studentClass);
        return studentClasses;
    }

}
