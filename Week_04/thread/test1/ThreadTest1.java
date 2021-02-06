package thread.test1;

import java.util.concurrent.FutureTask;

public class ThreadTest1 {

    /***
     * 1
     * @param args
     * @throws Exception
     */
    public static  void  test1( String name) throws Exception {
        long start=System.currentTimeMillis();
        Test1 t1 = new Test1();
        FutureTask<Integer> ft = new FutureTask<Integer>( t1);
        new Thread(ft).start();
        Integer result = t1.call();
        System.out.println(name+"异步计算结果为："+result);
        System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
    }
}
