package com.blueSky.dubbo.config;


import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * ****************************
 * <p>
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/15
 */
@Component
public class MyLoadBalance extends AbstractLoadBalance {

    public static final String NAME = "myLoadBalance";

//    private AppMessage appMessage;
//
//    public MyLoadBalance(AppMessage appMessage){
//        this.appMessage = appMessage;
//    }

    @Override
    protected <T> Invoker<T> doSelect(List<Invoker<T>> invokers, URL url, Invocation invocation) {
        System.out.println("myLoadBalance-------------------->"+invokers.get(0).getUrl());
//        Boolean testApp = appMessage.getTestApp();
//        System.out.println("isTestapp-------------------->"+testApp);
        return (Invoker)invokers.get(0);
    }

}
