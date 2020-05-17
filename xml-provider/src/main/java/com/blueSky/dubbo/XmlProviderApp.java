package com.blueSky.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * ****************************
 *
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/13
 */
@ImportResource(locations = "provider.xml")
@SpringBootApplication
public class XmlProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(XmlProviderApp.class,args);
    }

}
