package thread;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class ThreadTest12 {
    public static volatile  Integer  t7 = 0;

    /***
     * 4
     * @param args
     * @throws Exception
     */

    public static void  test1( String name) throws Exception {

        long start=System.currentTimeMillis();

        Semaphore sh = new Semaphore(1) ;

        for (int i = 0; i < 1; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        sh.acquire();
                        test1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        sh.release();
                    }
                }
            }).start();
        }
       Thread.sleep(3000);
            System.out.println(name+"异步计算结果为："+t7);
            System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");



    }
    private static int test1() {
         t7=fibo(13);
        System.out.println("aaaaaaaaaaaa");
        return t7;
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }

}
