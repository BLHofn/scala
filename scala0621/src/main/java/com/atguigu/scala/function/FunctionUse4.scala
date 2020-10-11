package com.atguigu.scala.function

object FunctionUse4 {
    def main(args: Array[String]): Unit = {
        //   简单版本
        def f1(name: String): String = {
            return name
        }

        //    如果知道返回值类型  那么可以直接省略后面的return
        def f2(name: String): String = {
            name
        }

        //    如果根据代码的返回值可以推断出类型  则可以省略返回值类型
        def f3(name: String) = {
            name
        }

        //        如果只有一行代码  此时可以省略大的花括号
        def f4(name: String) = name
    }

    //    如果一个函数没有参数列表def f3() = {println("hello")}  此时可以省略（）
    //    但是在访问的时候  不能加上小括号访问
    def f5 = "hello"

    //        println(f5())  //编译不能通过
    println(f5)

    //    如果函数中有明确return  返回值  那么函数的返回值类型不可以省略
//    def f6() = {
//        return "hello"
//    }

//    如果返回值类型为Unit  那么函数当中的return将不会起作用
    def f6(): Unit ={
        return "hello"
    }
    f6()

//    如果返回值类型为unit 那么如果想要省略就必须省略等号以及unit
    def f7(){println("xxxxx")}
    f7()
}
