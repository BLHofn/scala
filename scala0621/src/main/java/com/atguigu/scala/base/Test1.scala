package com.atguigu.scala.base

object Test1 {
    def main(args: Array[String]): Unit = {

//        var nn=()=>{
//            println("匿名")
//        }
//        nn()
//        nn
//        println(nn())
//        println(nn)
//        def f1 ={
//            println("jgfsjg")
//            "xss"
//        }
//        f1
////        println(f1)
//
//        def f2() {
//            return "xss"
//        }
//        def f3() ={
//            println("fafa")
//        }
//        def f4() {
//            println("faf")
//        }
//        f4
//
//
//        def test(): Unit ={
//            println("test...")
//        }
//        var test1=test()
//        var test2=test
//
//        test1
//        test2
////        println(test1)
////        println(test2)
//
//        var test3=()=>{println("test3...")
//        }
//        test3()
//        println(test3)


        def f1(x:Int) ={
            def f2(y:Int)={
                def f3(f:(Int,Int)=>Int) ={
                    val i = f(x, y)
                    println(i)
                }
                f3 _
            }
            f2 _
        }
        f1(10)(20)(_ * _)
    }
}
