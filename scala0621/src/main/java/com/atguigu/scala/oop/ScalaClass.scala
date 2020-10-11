package com.atguigu.scala.oop

// scala声明类和java一致
// object 会声明单例对象。对象中的方法可以类名直接访问
// object声明的类会在编译时，产生两个类文件
// 一个类文件就是当前的类文件
// 另外一个类文件就是特殊的单例对象类文件。
// 一般将使用object声明的类的单例对象称之伴生对象
// scala中没有静态语法。所以采用伴生对象的方式来模拟静态语法
// 如果同时存在使用class声明的类，这个时候，这个类称之为伴生类
object ScalaClass {
    def main(args: Array[String]): Unit = {
        println(ScalaAccess.num2)
    }
}