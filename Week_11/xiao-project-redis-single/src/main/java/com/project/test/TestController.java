package com.project.test;

import com.project.service.RedisServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class TestController {
    @Autowired
    RedisServiceApi redisServiceApi;
    @GetMapping("aaa")
    public  Object get(HttpServletRequest request, HttpServletResponse response) {
        String rKeyLock=request.getParameter("key");
        String requestId =java.util.UUID.randomUUID().toString().replaceAll("-", "");
            //获取锁
        System.out.println("A获取锁开始");
        Boolean lock = redisServiceApi.tryLock(rKeyLock, requestId, 10);
        if (null != lock && lock) {
            try {
                //TODO 业务处理
                Thread.sleep(2000);
                System.out.println("A获取锁中");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //释放锁
                System.out.println("A释放锁");
                Boolean release = redisServiceApi.releaseLock(rKeyLock, requestId);
            }
            return 2222;
        } else {
            System.out.println("A获取锁错误");
            return 1111;
        }

    }

    @GetMapping("bbb")
    public  Object sdf(HttpServletRequest request, HttpServletResponse response) {
        String rKeyLock=request.getParameter("key");
        String requestId =java.util.UUID.randomUUID().toString().replaceAll("-", "");
        //获取锁
        System.out.println("B获取锁开始");
        Boolean lock = redisServiceApi.tryLock(rKeyLock, requestId, 10);
        if (null != lock && lock) {
            try {
                //TODO 业务处理

                System.out.println("B获取锁中");


            } finally {
                //释放锁
                System.out.println("B释放锁");
                Boolean release = redisServiceApi.releaseLock(rKeyLock, requestId);
            }
            return 2222;
        } else {
            System.out.println("B获取锁错误");
            return 1111;
        }

    }
    @GetMapping("ccc")
    public  Object ccc(HttpServletRequest request, HttpServletResponse response) {
        String rKeyLock=request.getParameter("key");



       ExecutorService es =  Executors.newFixedThreadPool(20);
        for (int i = 0; i < 10 ; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    //加库存
                    Long val = redisServiceApi.getNum(rKeyLock,1l);
                    System.out.println("加库存val="+val);
                }
            });
        }
       es.shutdown();
       while (true) {
           if(es.isTerminated()) {
               break;
           }
       }
            return 1111;

    }
    @GetMapping("ddd")
    public  Object ddd(HttpServletRequest request, HttpServletResponse response) {
        String rKeyLock=request.getParameter("key");



        ExecutorService es =  Executors.newFixedThreadPool(20);
        for (int i = 0; i < 10 ; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    //减库存
                    Long val = redisServiceApi.getNum(rKeyLock,-1l);
                    System.out.println("减库存val="+val);
                }
            });
        }
        es.shutdown();
        while (true) {
            if(es.isTerminated()) {
                break;
            }
        }
        return 1111;

    }
}
