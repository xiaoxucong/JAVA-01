package thread.test1;

import java.util.concurrent.Callable;

public class Test1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return fibo(4);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
