package com.blueSky.dubbo.config;

import api.service.StudentClassService;
import com.alibaba.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * ****************************
 *
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/12
 */
@Configuration
public class DubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-studentClass-provider");
        return applicationConfig;
    }


    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }


    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("127.0.0.1:2181");
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }

    @Bean
    public ServiceConfig<StudentClassService> serviceConfig(){
        ServiceConfig<StudentClassService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(StudentClassService.class);
        serviceConfig.setTimeout(4000);
        // 灰度发布
        // serviceConfig.setVersion("V1.1.1.0");
        // 方法级别设置
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("listStudentClass");
        // 设置超时时间
        methodConfig.setTimeout(3000);
        List<MethodConfig> methodConfigs = new ArrayList<>();
        methodConfigs.add(methodConfig);
        serviceConfig.setMethods(methodConfigs);
        return serviceConfig;
    }

    /** 注册进监控中心 */
    @Bean
    public MonitorConfig monitorConfig(){
        MonitorConfig monitorConfig = new MonitorConfig();
        // 自动发现
        monitorConfig.setProtocol("registry");
        // monitorConfig.setAddress("127.0.0.1:7000");
        return monitorConfig;
    }

}
