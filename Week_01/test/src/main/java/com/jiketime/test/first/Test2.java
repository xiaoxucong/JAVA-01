package com.jiketime.test.first;

public class Test2 {
    public static void main(String[] args) {
        new Test2().add();
        new Test2().sub();
        new Test2().divided();
        new Test2().ride();
    }

    public void add() {
        long s = 1 ;
        long d = 3;

        long f = s +d ;
        System.out.println(f);
    }
    public void sub() {
        long s = 1 ;
        long d = 3;

        long f =  s -d ;
        System.out.println(f);
    }

    public void  divided() {
        long s = 1 ;
        long d = 3;

        long g =  d/s  ;
        System.out.println(g);
    }

    public void  ride() {
        long s = 1 ;
        long d = 3;

        long gf =  d*s ;
        System.out.println(gf);
    }
}
