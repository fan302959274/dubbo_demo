package com.fox.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fox.api.ProviderApiService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sh00859 on 2018/4/10.
 *//*





/**
 * 测试接口类
 *
 * @author
 * @create 2018-04-10 17:20
 **/

@Service
public class TestService {
    @Reference(group = "group1", timeout = 100000, actives = 10, connections = 10)
//    @Reference
    private ProviderApiService providerApiService;
//    @Reference(group = "group2")
//    private ProviderApiService providerApiService2;
//    @Reference(group = "group1",url = "dubbo://192.168.20.8:20880", cache = "true")
//    private ProviderApiService providerApiService;

    public Map test(Map map) {
        String name = (String) map.get("name");
        Map resultMap = new HashMap();
        String result = providerApiService.queryDubboTestName(name);
//        result = providerApiService2.queryDubboTestName(name);
        resultMap.put("name", result);
        return resultMap;
    }

    public void test2() {
        Long result = providerApiService.increaseStock();
    }

    public void testTimeOut() {
        String result = providerApiService.testTimeOut();
    }

    public Integer randomBalance() {
        return providerApiService.randomBalance();
    }
}
