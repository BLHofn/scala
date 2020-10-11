package com.atguigu.scala.oop;

public class JavaMethod2 {
    public static void main(String[] args) {

        EEE e = new EEE(); // 20
        System.out.println(e.getSum());

        FFF f = new FFF(); // 40
        System.out.println(f.getSum());

        EEE ef1 = new FFF(); // 40
        System.out.println(ef1.getSum());

        // 当父子类中存在相同的方法时，这个方法称之为重写
        // 内存中有两个一模一样的方法，JVM如何区分。
        // 动态绑定机制
        // 在调用对象的成员方法时，会判断提供方法的对象的实际内存是什么
        // 然后将内存和方法进行绑定。
        // 动态绑定机制和属性无关，在哪声明在哪使用
        EEE ef2 = new FFF(); // 30
        System.out.println(ef2.getSum());
    }
}
class EEE {
    public int i = 10;
    public int getSum() {
        return getI() + 10;
    }
    public int getI() {
        return i;
    }
}
class FFF extends EEE {
    public int i = 20;
    public int getI() {
        return i;
    }
}