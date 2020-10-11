package com.atguigu.scala.function

object FunctionUse13 {
    def main(args: Array[String]): Unit = {
        /*
        递归：就是自己调用自己
        1、递归需要有跳出的逻辑  不然会造成oom
        2、递归的数据之间有规律
        3、递归要知道有明确的·返回值类型  因为编译器会推断不出来
         */

//        求5的阶乘
        def f1(num:Int):Int={
            if (num<=1){
                1
            }else{
                num*f1(num-1)
            }
        }

        println(f1(5))

//        尾递归
        var j=1
        def test1(name:String): Unit ={
            println("test..."+(j+1))
            test1(name)
        }
//        这个方法会造成报错StackOverflowError
        def test2(name:String): Unit ={
            test2(name)
            println("test...")
        }
        //test2("xss")
        test1("xss")
    }
}
