package com.fox.config.dubbo;

import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class AuthorityFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorityFilter.class);
  
    private IpWhiteList ipWhiteList;  
  
    //dubbo通过setter方式自动注入  
    public void setIpWhiteList(IpWhiteList ipWhiteList) {  
        this.ipWhiteList = ipWhiteList;  
    }  
  
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        if (!ipWhiteList.isEnabled()) {  
            LOGGER.info("白名单禁用");
            return invoker.invoke(invocation);  
        }  
  
        String clientIp = RpcContext.getContext().getRemoteHost();  
        LOGGER.info("访问ip为{}", clientIp);
        List<String> allowedIps = ipWhiteList.getAllowedIps();
        if (allowedIps.contains(clientIp)) {  
            return invoker.invoke(invocation);  
        } else {  
            return new RpcResult();  
        }  
    }  
} 