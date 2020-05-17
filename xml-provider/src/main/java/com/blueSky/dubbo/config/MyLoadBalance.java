package com.blueSky.dubbo.config;


import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance;
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

    private final Random random = new Random();



    @Override
    protected <T> Invoker<T> doSelect(List<Invoker<T>> invokers, URL url, Invocation invocation) {
        System.out.println("myLoadBalance-------------------->");
        int length = invokers.size();
        int totalWeight = 0;
        boolean sameWeight = true;

        int offset;
        int i;
        for(offset = 0; offset < length; ++offset) {
            i = this.getWeight((Invoker)invokers.get(offset), invocation);
            totalWeight += i;
            if(sameWeight && offset > 0 && i != this.getWeight((Invoker)invokers.get(offset - 1), invocation)) {
                sameWeight = false;
            }
        }

        if(totalWeight > 0 && !sameWeight) {
            offset = this.random.nextInt(totalWeight);

            for(i = 0; i < length; ++i) {
                offset -= this.getWeight((Invoker)invokers.get(i), invocation);
                if(offset < 0) {
                    return (Invoker)invokers.get(i);
                }
            }
        }

        return (Invoker)invokers.get(this.random.nextInt(length));
    }
}
