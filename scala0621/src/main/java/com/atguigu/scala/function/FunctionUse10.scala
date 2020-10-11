package com.atguigu.scala.function

object FunctionUse10 {
    def main(args: Array[String]): Unit = {

//        控制抽象  那个函数没有参数以及返回值才可使用
        //        没有传入完整的函数而是只传入一段逻辑  看起来他是不完整的抽象的  所以要控制抽象让抽象代码执行
//        1 没有使用控制抽象时
//        def f1(f: ()=>Unit): Unit ={
//            f()
//        }
//        f1(()=>println("我是逻辑"))


//        2使用控制抽象  可以省略()

        def f2() ={
            println("xxxx")
        }
        def f1(f : =>Unit): Unit ={
            f
        }
        //        定义一个控制抽象如果传入的逻辑只有一行则使用小括号表示  如果有多行逻辑则可以使用花括号{}表示
        f1(println("cafaf"))
        f1{
            println("jfafka")
            println("jfafka")
            println("jfafka")
        }

        f1(f2())
    }
}
