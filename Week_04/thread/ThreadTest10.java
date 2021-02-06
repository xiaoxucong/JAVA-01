package thread;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest10 {
    public static volatile  Integer  t7 = 0;
    /***
     * 4
     * @param args
     * @throws Exception
     */

    public static void  test1( String name) throws Exception {
        long start=System.currentTimeMillis();

        CountDownLatch cd = new CountDownLatch(1);
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    test1();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    cd.countDown();
                }
            }
        }).start();
         cd.await();
        System.out.println(name+"异步计算结果为："+t7);
        System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
    }
    private static int test1() {
         t7=fibo(13);
        return t7;
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
