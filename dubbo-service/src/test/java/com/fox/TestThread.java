package com.fox;
/**
 * Created by sh00859 on 2018/4/23.
 */

/**
 * 测试线程
 *
 * @author
 * @create 2018-04-23 15:17
 **/
public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}