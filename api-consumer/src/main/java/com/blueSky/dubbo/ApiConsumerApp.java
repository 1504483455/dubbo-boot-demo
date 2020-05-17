package com.blueSky.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ****************************
 *
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/13
 */
@EnableDubbo(scanBasePackages = "com.blueSky.loadbalance")
@SpringBootApplication
public class ApiConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ApiConsumerApp.class,args);
    }

}
