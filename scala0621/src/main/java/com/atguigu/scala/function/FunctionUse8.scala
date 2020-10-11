package com.atguigu.scala.function

object FunctionUse8 {
    def main(args: Array[String]): Unit = {
//        函数作为返回值
        def f1(num1:Int): Unit ={
            println(num1)
        }

        def f2() ={
            f1 _
        }
        def f3() ={
            def f4(num1:Int): Unit ={
                println(num1)
            }
            f4 _
        }
        f2()(10)
        f3()(10)

        def fun (name :String,age:String,f:(String,String)=>String)={
            val str = f(name,age)
            println(str)

        }
        fun("lq","10",  _  +  _ )


    }
}
