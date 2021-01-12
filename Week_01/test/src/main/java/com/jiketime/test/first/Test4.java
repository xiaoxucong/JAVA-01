package com.jiketime.test.first;

public class Test4 {
    public static void main(String[] args) {
        new Test4().add();
        new Test4().sub();
        new Test4().divided();
        new Test4().ride();
    }

    public void add() {
        double s = 1 ;
        double d = 3;

        double f =  s +d ;
        System.out.println(f);
    }
    public void sub() {
        double s = 1 ;
        double d = 3;

        double f =  s -d ;
        System.out.println(f);
    }

    public void  divided() {
        double s = 1 ;
        double d = 3;

        double g =  d/s ;
        System.out.println(g);
    }

    public void  ride() {
        double s = 1 ;
        double d = 3;

        double gf = d*s ;
        System.out.println(gf);
    }
}
