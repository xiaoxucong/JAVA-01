package com.jiketime.test;

public class Test2 {
    public static void main(String[] args) {
        new Test2().method1();
        new Test2().method2();
    }
    public void method1(){
        int i = 1;
        int a = i++;
        System.out.println(a); //打印1
    }
    public void method2(){
        int i = 1;
        int a = ++i;
        System.out.println(a);//打印2
    }
}
