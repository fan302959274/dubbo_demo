package com.fox.service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by sh00859 on 2018/4/10.
 */
public interface ProviderService {
    String queryDubboTestName(String name);

    Long increaseStock();

    String testTimeOut();

    Integer randomBalance();

}
