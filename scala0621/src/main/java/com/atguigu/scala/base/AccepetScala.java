package com.atguigu.scala.base;

public class AccepetScala {
    public static void main(String[] args) {
        //使用java去访问scala对象
//        大致格式是要访问的scala对象$.MODULE$
//        HelloScala$.MODULE$.main(args);
        int i=0;
        i=i++;
        System.out.println(i);
//        Thread.yield();
    }
}

