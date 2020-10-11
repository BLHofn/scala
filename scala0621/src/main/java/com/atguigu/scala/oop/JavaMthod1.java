package com.atguigu.scala.oop;

public class JavaMthod1 {
//    这里使用的时候参数传入是什么类型的对象  而不是内存地址  所以调用方法时会根据参数的类型进行调用
    public static void main(String[] args) {
        BBB bbb = new BBB();
        test(bbb);
        CCC ccc = new CCC();
        test(ccc);
        BBB bcc = new CCC();
        test(bcc);
        System.out.println("aaa".equals("bbbb"));
    }
        public static void test( BBB bbb ) {
        System.out.println("bbb");
    }
    public static void test( CCC ccc ) {
        System.out.println("ccc");
    }
    }
    class BBB {
    }
    class CCC extends BBB {

    }
