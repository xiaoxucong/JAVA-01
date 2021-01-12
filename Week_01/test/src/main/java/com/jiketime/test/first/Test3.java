package com.jiketime.test.first;

public class Test3 {
    public static void main(String[] args) {
        new Test3().add();
        new Test3().sub();
        new Test3().divided();
        new Test3().ride();
    }

    public void add() {
        short s = 1 ;
        short d = 3;

        short f = (short) (s +d);
        System.out.println(f);
    }
    public void sub() {
        short s = 1 ;
        short d = 3;

        short f = (short) (s -d);
        System.out.println(f);
    }

    public void  divided() {
        short s = 1 ;
        short d = 3;

        short g = (short) (d/s);
        System.out.println(g);
    }

    public void  ride() {
        short s = 1 ;
        short d = 3;

        short gf = (short) (d*s);
        System.out.println(gf);
    }
}
