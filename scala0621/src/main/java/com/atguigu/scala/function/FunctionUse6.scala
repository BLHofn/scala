package com.atguigu.scala.function

object FunctionUse6 {
    def main(args: Array[String]): Unit = {
        def test(): Unit ={
            println("test.....")
        }
//        test()
//        FunctionUse6.test()
        println(test)
        println(test())
    }
    def test(): Unit ={
        println("xxxxxx")
    }
}
