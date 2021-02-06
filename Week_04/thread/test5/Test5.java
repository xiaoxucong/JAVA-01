package thread.test5;

import java.util.concurrent.Callable;

public class Test5 implements Runnable {




    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }

    @Override
    public void run() {
        ThreadTest5.t5=  fibo(4);
    }
}
