package thread;

import thread.test1.ThreadTest1;
import thread.test2.ThreadTest2;
import thread.test3.ThreadTest3;
import thread.test4.ThreadTest4;
import thread.test5.ThreadTest5;
import thread.test6.ThreadTest6;
import thread.test7.ThreadTest7;
import thread.test8.ThreadTest8;

import java.util.HashMap;

public class ConcurrentTest {


    public static void main(String[] args) throws Exception{
       /*
       ThreadTest1.test1("线程1");///FutureTask
        ThreadTest2.test1("线程2");//FutureTask  Executors.newFixedThreadPool  callable
        ThreadTest3.test1("线程3");// ExecutorService Future callable
        ThreadTest4.test1("线程4");//Future  CompletableFuture
        ThreadTest5.test1("线程5");// Thread volatile
       ThreadTest6.test1("线程6");//Thread  Runnable volatile
       ThreadTest7.test1("线程7");// Executors.newCachedThreadPool() volatile

       ThreadTest8.test1("线程8");  //异常
       ThreadTest9.test1("线程9");  //AtomicInteger volatile wait notifyAll


         ThreadTest10.test1("线程10");  //CountDownLatch volatile
         ThreadTest11.test1("线程11");  //cyclicBarrier volatile
*/
        ThreadTest12.test1("线程12");  //


    }
}
