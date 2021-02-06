package thread.test7;


import java.util.concurrent.*;

public class ThreadTest7 {
    public static volatile  Integer  t7 = 0;
    /***
     * 4
     * @param args
     * @throws Exception
     */
    public static void  test1( String name) throws Exception {
        long start=System.currentTimeMillis();
        ExecutorService sdf = Executors.newCachedThreadPool();
        sdf.execute(new Test7());
        sdf.shutdown();
        System.out.println(name+"异步计算结果为："+t7);
        System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
    }
}
