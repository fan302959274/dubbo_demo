package com.fox.service.mock;

import com.fox.api.convert.Son;
import com.fox.api.service.ProviderApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class ProviderApiServiceMock implements ProviderApiService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public String queryDubboTestName(String name) throws InterruptedException {
        logger.info("mock进来了");
        return null;
    }

    @Override
    public Long increaseStock() {
        return null;
    }

    @Override
    public String testTimeOut() {
        return null;
    }

    @Override
    public Integer randomBalance() {
        return null;
    }

    @Override
    public Son querySonInfo() {
        return null;
    }
}
