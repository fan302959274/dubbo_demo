package com.fox.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fox.api.ProviderApiService;
import com.fox.service.ProviderService;

import javax.annotation.Resource;

/**
 * Created by sh00859 on 2018/4/10.
 */
//@Service(filter = "authorityFilter")
@Service(group = "group1",actives = 1, connections = 1)
public class ProviderApiServiceImpl implements ProviderApiService {
    @Resource
    private ProviderService providerService;

    @Override
    public String queryDubboTestName(String name) throws InterruptedException {
//        Thread.sleep(10000);
        return providerService.queryDubboTestName(name);
    }

    @Override
    public Long increaseStock() {
        return providerService.increaseStock();
    }

    @Override
    public String testTimeOut() {
        return providerService.testTimeOut();
    }

    @Override
    public Integer randomBalance() {
        return providerService.randomBalance();
    }
}
