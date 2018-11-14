package com.fox.config.dubbo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * dubbo白名单
 *
 * @author
 * @create 2018-04-11 10:38
 **/
@Component
public class IpWhiteList {

    //白名单是否禁用
    public Boolean isEnabled() {
        return true;
    }

    //白名单列表
    List<String> getAllowedIps() {
        List<String> whiteList = new ArrayList<>();
        whiteList.add("192.168.30.9");
        whiteList.add("192.168.20.1");
        return whiteList;
    }

    public static void main(String[] args) {
    	System.out.println(Objects.equals("1038",new Short("1038")));
    }

}