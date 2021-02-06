package thread;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest9 {
    static AtomicInteger atomicInteger = new AtomicInteger(13);
    public static volatile  Integer  t7 = 0;
    public static volatile  boolean  re = false;
    /***
     * 4
     * @param args
     * @throws Exception
     */
    public static void  test1( String name) throws Exception {
        long start=System.currentTimeMillis();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test1();
            }
        }).start();
        synchronized (atomicInteger) {
            re = true;
            atomicInteger.wait();
            System.out.println(name+"异步计算结果为："+t7);
            System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");

        }

    }
    private static int test1() {


            re = true;
            t7=fibo(13);
        synchronized (atomicInteger) {
            atomicInteger.notifyAll();
        }



        return t7;
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return atomicInteger.getAndDecrement() + atomicInteger.getAndAdd(-2);
    }
}
