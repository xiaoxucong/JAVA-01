package thread.test2;



import java.util.concurrent.*;

public class ThreadTest2 {

    /***
     * 2
     * @param args
     * @throws Exception
     */
    public static void  test1(String name ) throws Exception {
        long start=System.currentTimeMillis();
        Test2 t2 = new Test2();
        FutureTask<Integer> ft = new FutureTask<Integer>(t2);
        ExecutorService es =  Executors.newFixedThreadPool(1);
        es.submit(ft);
        es.shutdown();
        Integer result = ft.get();
        System.out.println(name+"异步计算结果为："+result);
        System.out.println(name+"使用时间："+ (System.currentTimeMillis()-start) + " ms");
    }
}
