package thread.test4;


import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest4 {

    /***
     * 4
     * @param args
     * @throws Exception
     */
    public static void  test1( String name) throws Exception {
        long start=System.currentTimeMillis();
        Future<Integer> future  = CompletableFuture.supplyAsync(() -> fibo(8));
        System.out.println(name+"异步计算结果为："+future.get());
        System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
        List<Integer> list=  Arrays.asList(1,2,4,5,7);
        list.set(1,78);
    }
    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
