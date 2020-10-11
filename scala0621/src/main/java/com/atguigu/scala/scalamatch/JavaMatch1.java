package com.atguigu.scala.scalamatch;

public class JavaMatch1 {
    public static void main(String[] args) {
        int age=20;
        switch (age){
            default:
                System.out.println("你的年龄不合法");
            case 10:
                System.out.println("你的年龄为10");
//                break;
            case 20:
                System.out.println("你的年龄为20");
//                break;
            case 30:
                System.out.println("你的年龄为30");
                break;

        }
    }
}
