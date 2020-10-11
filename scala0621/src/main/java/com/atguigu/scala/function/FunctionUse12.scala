package com.atguigu.scala.function

object FunctionUse12 {
    def main(args: Array[String]): Unit = {
//        如果定义了一个匿名函数但是没有使用  会将下面的东西也影响了
//        ()=>{println("我是匿名函数")}
        def f1(): Unit ={
            println("我不是匿名方法")
        }
        f1()
        def f2(a:Int,b:Int,f:(Int,Int)=>Unit){
            f(a,b)
        }
        def f3(a:Int,b:Int){
            println(a+b)
        }
        f2(10,20,(a:Int,b:Int)=>return a+b)
        f2(10,20,( _ + _))
    }
}
