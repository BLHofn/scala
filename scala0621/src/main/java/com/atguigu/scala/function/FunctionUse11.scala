package com.atguigu.scala.function

object FunctionUse11 {
    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 地狱
                def f1(): Unit = {
                    println("f1.....")
                }


                def test( f : ()=>Unit ): Unit = {
                    f()
                }
//         test方法明确了参数类型，所以传递的参数只能是函数
//         下划线的语法可以将函数作为整体来使用，但是如果明确了函数类型的话，下划线可以省略。
        test(f1)
        test(f1 _)
//        test(f1())

    }
}
