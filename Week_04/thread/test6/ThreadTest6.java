package thread.test6;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest6 {
    public static volatile  Integer  t6 = 0;
    /***
     * 4
     * @param args
     * @throws Exception
     */
    public static void  test1( String name) throws Exception {
        long start=System.currentTimeMillis();
        Thread r = new Thread(new Runnable() {
            @Override
            public void run() {
                t6 = fibo(20);
            }
        });
        r.start();
        r.join();
        System.out.println(name+"异步计算结果为："+t6);
        System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
    }
    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
