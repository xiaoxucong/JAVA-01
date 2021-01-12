package com.jiketime.test.first;

public class Test5 {
    public static void main(String[] args) {
        new Test5().add();
        new Test5().sub();
        new Test5().divided();
        new Test5().ride();
    }

    public void add() {
        float s = 1 ;
        float d = 3;

        float f =  s +d ;
        System.out.println(f);
    }
    public void sub() {
        float s = 1 ;
        float d = 3;

        float f =  s -d ;
        System.out.println(f);
    }

    public void  divided() {
        float s = 1 ;
        float d = 3;

        float g =  d/s ;
        System.out.println(g);
    }

    public void  ride() {
        float s = 1 ;
        float d = 3;

        float gf = d*s ;
        System.out.println(gf);
    }
}
