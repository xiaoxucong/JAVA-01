package thread.test8;


import thread.test7.Test7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest8 {
    static  Lock lock = new ReentrantLock();
    static Condition cd = lock.newCondition();
    static Condition cd1 = lock.newCondition();
    public static volatile  Integer  t7 = 0;
    public static volatile  boolean  re = false;
    /***
     * 4
     * @param args
     * @throws Exception
     */
    public static void  test1( String name) throws Exception {
        try{
            long start=System.currentTimeMillis();
            Thread tr = new Thread(new Runnable() {
                @Override
                public void run() {
                    test1();
                }
            });
            tr.start();
            Thread.sleep(1000);
            try {
                lock.lock();
                if (re ) {
                    System.out.println("测试-3");
                    cd1.signal();
                    System.out.println("测试-4");
                    cd.await();
                    System.out.println(name+"异步计算结果为："+t7);
                    System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }catch (Exception e) {

        }finally {
           lock.unlock();
        }

    }
    private static int test1() {

        try{
            lock.lock();
            re=true;
                cd1.await();
                t7=fibo(100);
                cd.signal();

        }catch (Exception e) {
        }finally {
            lock.unlock();
        }
        return t7;
    }

    private static int fibo(int a) {
        if ( a < 2) {

            return 1;
        }

        return fibo(a-1) + fibo(a-2);
    }
}
