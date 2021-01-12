package com.jiketime.test.first;

public class Test1 {
    public static void main(String[] args) {
        new Test1().add();
        new Test1().sub();
        new Test1().divided();
        new Test1().ride();
    }

    public void add() {
        int s = 1 ;
        int d = 3;

        int f = s +d ;
        System.out.println(f);
    }
    public void sub() {
        int s = 1 ;
        int d = 3;

        int f =  s -d ;
        System.out.println(f);
    }

    public void  divided() {
        int s = 1 ;
        int d = 3;

        int g =  d/s  ;
        System.out.println(g);
    }

    public void  ride() {
        int s = 1 ;
        int d = 3;

        int gf =  d*s ;
        System.out.println(gf);
    }
}
