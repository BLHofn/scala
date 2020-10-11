package com.atguigu.scala.function

object FunctionUse7 {
    def main(args: Array[String]): Unit = {

        //        关于匿名函数的声明和使用
        //        首先省略def  以及方法名  由于返回值的类型可以通过最后一行返回值的类型推断 而且return也可以省略
        //        def f1(){println("f1......")}
        val f1 = () => {
            println("f1.....")
        } //此时是将一个方法当作一个对象传给了一个变量  因此unit是对象的引用
        //        println(f1)  //因此此处的f1打印的是地址值
        //        f1()//此处是对方法的调用

        //        把参数当成一个值来传递
        def fun1(): String = {
            "zhangsan"
        }

        val a = fun1() //是将函数运行的值赋值给a
        //将函数当成一个对象赋值给一个变量
        val b = fun1 _
        println(a)
        println(b)
        //        把函数作为参数
        def f2(num1: Int, num2: Int, f: (Int, Int) => Int): Unit = {
            val i = f(num1, num2)
            println(i)
        }

        def sum(num1: Int, num2: Int): Int = {
            num1 + num2
        }

        f2(10, 20, sum)
        f2(10, 20, (a: Int, b: Int) => a + b)
        f2(10, 20, _ + _)

        //        一个方法当作普通方法来是使用的话它的参数个数是没有任何限制的
        //        如果把一个函数当成一个对象（val f1 = ()=>{println("f1.....")}）那么他的参数类型最多只能有22个
        val function: (Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) => Unit = (
              num111:Int,
              num2:Int,
              num3:Int,
              num4:Int,
              num5:Int,
              num6:Int,
              num7:Int,
              num8:Int,
              num9:Int,
              num10:Int,
              num11:Int,
              num12:Int,
              num13:Int,
              num14:Int,
              num15:Int,
              num16:Int,
              num17:Int,
              num18:Int,
              num19:Int,
              num20:Int,
              num21:Int,
              num22:Int
//              num23:Int
              ) => {}
        println(function)//如果超过23个就会报错Error:(66, 17) implementation restricts functions to 22 parameters) => {}
    }
}
