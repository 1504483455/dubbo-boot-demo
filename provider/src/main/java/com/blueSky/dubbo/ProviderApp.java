package com.blueSky.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


/**
 * ****************************
 * 启动类com.alibaba.dubbo.rpc.cluster.LoadBalance
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/12
 */
@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class ProviderApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(ProviderApp.class,args);
    }
}
