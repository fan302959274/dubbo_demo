package com.fox.api.service;

import com.fox.api.convert.Son;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by sh00859 on 2018/4/10.
 */
public interface ProviderApiService {
    String queryDubboTestName(String name) throws InterruptedException;

    Long increaseStock();

    /**
     * dubbo的熔断，限流，降级
     * 1、熔断策略:超时
     */

    String testTimeOut();

    Integer randomBalance();

    Son querySonInfo();


}
