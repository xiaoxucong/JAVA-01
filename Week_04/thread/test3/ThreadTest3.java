package thread.test3;


import thread.test2.Test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {

    /***
     * 3
     * @param args
     * @throws Exception
     */
    public static void  test1( String name) throws Exception {
        long start=System.currentTimeMillis();
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> future = executor.submit(() -> { //Lambda 是一个 callable， 提交后便立即执行，这里返回的是 FutureTask 实例
            System.out.println("running task");
            Thread.sleep(10000);
            return fibo(40);
        });
        executor.shutdown();
        Integer result = future.get();
        System.out.println(name+"异步计算结果为："+result);
        System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
    }
    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
