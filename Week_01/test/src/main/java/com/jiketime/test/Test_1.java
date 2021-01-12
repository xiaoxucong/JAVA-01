package com.jiketime.test;

public class Test_1 {
    public static void main(String[] args) {
        new Test_1().r();
        new Test_1().sr();
    }

    private void r()  {
        int s = 1;
        ++s;
        System.out.println(s);
    }
    private void sr()  {
        int s = 1;
        s++;
        System.out.println(s);
    }
}
