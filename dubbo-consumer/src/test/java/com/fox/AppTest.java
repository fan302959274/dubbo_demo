//package com.fox;
//
//import com.alibaba.dubbo.config.annotation.Reference;
//import com.fox.api.ProviderApiService;
//import org.apache.log4j.net.SocketServer;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import redis.clients.jedis.HostAndPort;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisCluster;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.HashSet;
//import java.util.Random;
//import java.util.Set;
//
//import static org.junit.Assert.assertTrue;
//
///**
// * Unit test for simple App.
// */
//
///**
// * Hello world!
// */
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = App.class)
//public class AppTest {
//
////    @Reference
////    private ProviderApiService providerApiService;
////
////    @Test
////    public void shouldAnswerWithTrue() {
////        System.out.println(providerApiService.queryDubboTestName("cff"));
////        assertTrue(true);
////    }
//    @Test
//    public void test1(){
//        Random random = new Random();
//        System.out.println(random.nextInt(20));
//    }
//
//    @Test
//    public void test2(){
//        byte[] b1,b2,b3,b4;//定义变量
//        b1=new byte[1024*1024];//分配 1MB 堆空间，考察堆空间的使用情况
//        b2=new byte[1024*1024];
//        b3=new byte[1024*1024];
//        b4=new byte[1024*1024];
//    }
//
//    @Test
//    public void socketTest() throws IOException {
//        Socket socket = new Socket("127.0.0.1", 6379);
//        StringBuffer sb = new StringBuffer();
//        sb.append("*3\r\n");
//        sb.append("$3\r\n");
//        sb.append("SET\r\n");
//        sb.append("$2\r\n");
//        sb.append("gw\r\n");
//        sb.append("$2\r\n");
//        sb.append("go\r\n");
//        socket.getOutputStream().write(sb.toString().getBytes());
//    }
//
//    @Test
//    public void jedisClusterTest() throws IOException {
//        HostAndPort hostAndPort = new HostAndPort("127.0.0.1", 6379);
//        Set<HostAndPort> hostAndPortSet = new HashSet<>();
//        hostAndPortSet.add(hostAndPort);
//        JedisCluster jedis = new JedisCluster(hostAndPortSet);
//        jedis.set("gw","gw");
//        System.out.println("cff");
//    }
//    @Test
//    public void jedisTest() throws IOException {
////        HostAndPort hostAndPort = new HostAndPort("127.0.0.1", 6379);
////        Set<HostAndPort> hostAndPortSet = new HashSet<>();
////        hostAndPortSet.add(hostAndPort);
//        Jedis jedis = new Jedis("127.0.0.1");
//        jedis.set("gw","gw");
//        System.out.println("cff");
//    }
//
//    @Test
//    public void socketListenerTest() throws IOException {
//        ServerSocket socketServer = new ServerSocket(6379);
//        Socket socket = socketServer.accept();
//        byte[] result = new byte[2048];
//        socket.getInputStream().read(result);
//        System.out.println(new String(result));
//    }
//
//}
