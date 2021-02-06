package thread.test5;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest5 {
    public static volatile  Integer  t5 = 0;

    /***
     * 5
     * @param args
     * @throws Exception
     */
    public static void  test1( String name) throws Exception {
        long start=System.currentTimeMillis();
        Thread thread = new Thread(new Test5());
        thread.start();
        thread.join();
        System.out.println(name+"异步计算结果为："+t5);
        System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
    }
}
