package com.blueSky.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ****************************
 * <p>
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/13
 */
@EnableDubbo(scanBasePackages = "com.blueSky.dubbo")
@SpringBootApplication
public class ApiProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ApiProviderApp.class,args);
    }

}
