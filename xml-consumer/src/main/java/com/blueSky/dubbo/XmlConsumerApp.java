package com.blueSky.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@ImportResource(locations = "consumer.xml")
@SpringBootApplication
public class XmlConsumerApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(XmlConsumerApp.class,args);
    }
}
