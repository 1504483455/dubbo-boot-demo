package com.blueSky.dubbo.service.impl;

import api.domain.StudentClass;
import api.service.StudentClassService;
import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import sun.nio.cs.ext.MacThai;

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
 * @date 2020/5/12
 */
@Service
public class StudentClassServiceImpl implements StudentClassService {

    @HystrixCommand
    @Override
    public List<StudentClass> listStudentClass(String studentNo) {
        System.out.println("boot provider StudentClassServiceImpl listStudentClass......");
        if(Math.random() > 0.5){
            throw new RuntimeException("随意异常");
        }
        List<StudentClass> studentClasses = new ArrayList<>();
        StudentClass studentClass = new StudentClass();
        studentClass.setAllTime(1000);
        studentClass.setName("网络通讯");
        studentClass.setStudentNo("1");
        studentClass.setUuid(UUID.randomUUID().toString());
        studentClasses.add(studentClass);
        return studentClasses;
    }

}
