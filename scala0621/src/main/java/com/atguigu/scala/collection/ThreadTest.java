package com.atguigu.scala.collection;

public class ThreadTest {
    public static void main(String[] args) {
        Student s=new Student();
        Thread t1=new Thread(()->{
            s.name="zhamgsan";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s.name);
        });
        Thread t2=new Thread(()->{
            s.name="lisi";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s.name);
        });
        t1.start();
        t2.start();
        System.out.println("main...");
    }
}
class Student{
    public String name;
}