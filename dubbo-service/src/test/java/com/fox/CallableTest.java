package com.fox;/**
 * Created by sh00859 on 2018/4/26.
 */

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * callable测试类
 *
 * @author
 * @create 2018-04-26 15:09
 **/
class CallableThred implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "1234666";
    }
}

public class CallableTest {
    public static void main(String[] args) throws Exception {
        FutureTask<String> task = new FutureTask<>(new CallableThred());
        new Thread(task).start();

        String result = task.get();
        task.cancel(true);

        boolean flag = task.isDone();
        System.out.println(flag+"===="+result);


    }

}