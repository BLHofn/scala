package com.atguigu.scala.function;

public class m11 {
    static int i=0;
    public static void m1(String name){
        System.out.println("test"+(i++));
        m1(name);
    }
    public static void main(String[] args) {
        m1("xss");
    }
}
