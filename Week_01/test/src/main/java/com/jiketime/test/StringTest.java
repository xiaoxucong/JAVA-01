package com.jiketime.test;

public class StringTest {
    public static void main(String[] args) {
        new StringTest().method1();
        new StringTest().method2();
        new StringTest().method3();
    }
    public void method1(){
        String i = "a"+"b";
        String a = i +"c";
        System.out.println(a); //打印1
    }
    public void method2(){
        StringBuilder s = new StringBuilder("a").append("b");
        s.append("c");
        System.out.println(s); //打印1
    }
    public void method3(){
        StringBuffer s = new StringBuffer("a").append("b");
        s.append("c");
        System.out.println(s); //打印1
    }
}
