package com.jiketime.test.first;

public class Test {
    public static void main(String[] args) {
        new Test().add();
        new Test().sub();
        new Test().divided();
        new Test().ride();
    }

    public void add() {
        byte s = 1 ;
        byte d = 3;

        byte f = (byte) (s +d);
        System.out.println(f);
    }
    public void sub() {
        byte s = 1 ;
        byte d = 3;

        byte f = (byte) (s -d);
        System.out.println(f);
    }

    public void  divided() {
        byte s = 1 ;
        byte d = 3;

        byte g = (byte) (d/s);
        System.out.println(g);
    }

    public void  ride() {
        byte s = 1 ;
        byte d = 3;

        byte gf = (byte) (d*s);
        System.out.println(gf);
    }
}
