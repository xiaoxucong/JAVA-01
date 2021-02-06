package thread.test4;

import java.util.concurrent.Callable;

public class Test4 implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        return fibo(4);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
