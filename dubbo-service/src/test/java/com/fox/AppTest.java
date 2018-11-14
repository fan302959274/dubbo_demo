package com.fox;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import sun.misc.Unsafe;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     *@description newSingleThreadExecutor
     *@author sh00859
     *@date 2018/4/23
     */
    @Test
    public void newSingleThreadExecutor()
    {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Thread t1 = new TestThread();
        Thread t2 = new TestThread();
        Thread t3 = new TestThread();
        Thread t4 = new TestThread();
        Thread t5 = new TestThread();
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        pool.shutdown();
    }

    /**
     *@description newFixedThreadPool
     *@author sh00859
     *@date 2018/4/23
     */
    @Test
    public void newFixedThreadPool()
    {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Thread t1 = new TestThread();
        Thread t2 = new TestThread();
        Thread t3 = new TestThread();
        Thread t4 = new TestThread();
        Thread t5 = new TestThread();
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        pool.shutdown();
    }
    /**
     *@description newCachedThreadPool
     *@author sh00859
     *@date 2018/4/23
     */
    @Test
    public void newCachedThreadPool()
    {
        ExecutorService pool = Executors.newCachedThreadPool();
        Thread t1 = new TestThread();
        Thread t2 = new TestThread();
        Thread t3 = new TestThread();
        Thread t4 = new TestThread();
        Thread t5 = new TestThread();
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        pool.shutdown();
    }

    /**
     *@description newScheduledThreadPool
     *@author sh00859
     *@date 2018/4/23
     */
    @Test
    public void newScheduledThreadPool()
    {
        ScheduledThreadPoolExecutor  executor = new ScheduledThreadPoolExecutor(1);
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("12312");
            }
        } ,1000, 5000, TimeUnit.MILLISECONDS);



//        executor.scheduleAtFixedRate(new Runnable() {//每隔一段时间打印系统时间，证明两者是互不影响的
//            @Override
//            public void run() {
//                System.out.println(System.nanoTime());
//            }
//        }, 1000, 2000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testgetIntVolatile(){
        System.out.println(new AtomicInteger(1).getAndIncrement());
    }
}
