package thread;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest11 {
    public static volatile  Integer  t7 = 0;

    /***
     * 4
     * @param args
     * @throws Exception
     */

    public static void  test1( String name) throws Exception {

        long start=System.currentTimeMillis();

         CyclicBarrier cyclicBarrier = new CyclicBarrier(1 , new Runnable() {
             @Override
             public void run() {
                 System.out.println(name+"异步计算结果为："+t7);
                 System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
             }
         });

        for (int i = 0; i < 1; i++) {
            new Thread(new Test(cyclicBarrier)).start();
        }



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
    static class  Test implements Runnable {
        private CyclicBarrier cyclicBarrier;
        public  Test(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier=cyclicBarrier;
        }
        @Override
        public void run() {
            try {
                test1();
                cyclicBarrier.await();
                System.out.println("33333");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
