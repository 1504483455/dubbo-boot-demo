package com.blueSky.dubbo.service.impl;

import api.domain.StudentClass;
import api.service.StudentClassService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

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
@Service
@Component
public class StudentClassServiceImpl implements StudentClassService {

    @Override
    public List<StudentClass> listStudentClass(String studentNo) {
        System.out.println("boot api provider StudentClassServiceImpl listStudentClass......");
        List<StudentClass> studentClasses = new ArrayList<>();
        StudentClass studentClass = new StudentClass();
        studentClass.setAllTime(2000);
        studentClass.setName("api调用工程师");
        studentClass.setStudentNo("1");
        studentClass.setUuid(UUID.randomUUID().toString());
        studentClasses.add(studentClass);
        return studentClasses;
    }

}
