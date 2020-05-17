//package com.blueSky.dubbo.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * ****************************
// * <p>
// * ****************************
// *
// * @author blueSky
// * @version 1.0
// * @date 2020/5/16
// */
//@Configuration
//public class AppConfig {
//
//    @Value("${version}")
//    private String version;
//
//    @Value("${testApp}")
//    private Boolean testApp;
//
//    @Bean
//    public AppMessage appMessage(){
//        AppMessage appMessage = new AppMessage();
//        if(testApp == null){
//            testApp = false;
//        }
//        appMessage.setTestApp(testApp);
//        appMessage.setVersion(version);
//        return appMessage;
//    }
//
//    @Bean
//    public MyLoadBalance myLoadBalance(AppMessage appMessage){
//        return new MyLoadBalance(appMessage);
//    }
//}
