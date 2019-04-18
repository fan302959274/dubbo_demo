package com.fox.controller;/**
 * Created by sh00859 on 2018/4/10.
 */

import com.fox.service.TestService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试接口类
 *
 * @author
 * @create 2018-04-10 17:20
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping(value = {"/test1"})
    @ResponseBody
    public Map test(@RequestBody Map map) throws InterruptedException {
        return testService.test(map);
    }

    @RequestMapping(value = {"/test2"})
    public void test() {
        testService.test2();
    }

    @RequestMapping(value = {"/test3"})
    public void test3() {
        testService.testTimeOut();
    }

    @RequestMapping(value = {"/test4"})
    @ResponseBody
    public Integer test4() {
        return testService.randomBalance();
    }

}