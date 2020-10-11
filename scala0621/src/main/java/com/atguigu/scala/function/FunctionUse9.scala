package com.atguigu.scala.function

import scala.util.control.Breaks

object FunctionUse9 {
    def main(args: Array[String]): Unit = {
//        发生闭包的三种情况：
//        1、所有匿名函数都有闭包
//        2、当把函数当成对象使用是会产生闭包
//        3、如果函数引用外部变量  导致外部变量的生命周期发生了改变
// scala闭包效果在2.12版本前采用的匿名函数类
// scala在2.12版本后不再采用这种方式
        val name="zhangsan"

        Breaks.breakable()
        def f1(): Unit ={
            println(name)
        }
        val f=f1 _
        f()
    }

}
