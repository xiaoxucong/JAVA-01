package thread.test7;

import thread.test5.ThreadTest5;

public class Test7 implements Runnable {




    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }

    @Override
    public void run() {
        ThreadTest7.t7=  fibo(4);
    }
}
