package com.blueSky.dubbo.config;

import api.service.StudentClassService;
import api.service.StudentService;
import com.alibaba.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * ****************************
 * <p>
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/12
 */
@Configuration
public class DubboConfig {

//    @Bean
//    public ProtocolConfig protocolConfig(){
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("loadbalance");
//        protocolConfig.setPort(20882);
//        return protocolConfig;
//    }

    // <loadbalance:application name="demo"/>
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-studentClass-consumer-api");
        return applicationConfig;
    }

    // <loadbalance:registry address="zookeeper://127.0.0.1:2181"/>
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        // 注册中心地址
        registryConfig.setAddress("127.0.0.1:2181");
        // 注册中心协议
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }

    /*
    <loadbalance:reference id="studentClassService" check="false"
        version="0.1.0" stub="consumer.com.blueSky.service.impl.ClassServiceStub"
        retries="0" timeout="3000" interface="api.service.StudentClassService">
            <loadbalance:method name="listStudentClass" />
    </loadbalance:reference>
     */
    @Bean
    public ReferenceConfig<StudentService> serviceConfig(){
        ReferenceConfig<StudentService> reference = new ReferenceConfig<>();
        reference.setInterface(StudentClassService.class);
        reference.setId("studentClassService");
        // 方法级别设置
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("listStudentClass");
        // 设置超时时间
        methodConfig.setTimeout(3000);
        List<MethodConfig> methodConfigs = new ArrayList<>();
        methodConfigs.add(methodConfig);
        reference.setMethods(methodConfigs);
        return reference;
    }

    @Bean
    public MonitorConfig monitorConfig(){
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setAddress("127.0.0.1:7000");
        return monitorConfig;
    }
}
