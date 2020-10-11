package com.atguigu.scala.function

object FunctionUse5 {
    def main(args: Array[String]): Unit = {

        //        匿名函数的使用  省略函数的def和函数名称
        //        匿名函数不能直接使用  可以通过赋值给变量以及当成函数的参数使用
        //        1、当匿名函数赋值给变量时
        val f1: () => Unit = () => {
            println("匿名函数")
        }
        //println(f1)  //此时f1是一个对象
        //f1()//这个是调用方法
        //println(f1())//调用方法并返回返回值

        //        2、当把匿名函数当成参数传给函数  场景给两个数进行不同的加减乘除等等操作
        def sum(num1: Int, num2: Int): Int = {
            num1 + num2
        }

        def js(num1: Int, num2: Int, function: (Int, Int) => Int): Unit = {
            val result = function(num1, num2)
            println(result)
        }

        js(10, 20, sum)
        js(10, 20, (a: Int, b: Int) => a + b)
        js(10, 20, (a: Int, b: Int) => a * b)
        js(10, 20, _ + _)

        //如果方法不是匿名方法  那么他在传给变量的时候  他是把函数的返回值给了变量
//        如果在传递参数的时候  在函数的后面加上下划线 是将函数函数整体传给变量
        def fun1(): String = {
            "zhangsan"
        }

        val a = fun1() //
        val b = fun1 _
        println(a)
        println(b)
        println("lllll"+fun1)

        def makeAdd(more: Int) = (x: Int) => x + more
        val addOne = makeAdd(1)
        println(addOne)
    }
}
