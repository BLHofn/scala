package com.atguigu.scala.collection

object ScalaArray1 {
    def main(args: Array[String]): Unit = {
        //        申明一个数组 []里面的泛型是数组的数据类型  （）当中是数组的大小
        val arry1: Array[Int] = new Array[Int](5)
//        给数组赋值  在这里不能使用[]  需要使用（）
        arry1(0)=0
        arry1(1)=1
        arry1(2)=2
        arry1(3)=3
        arry1(4)=4
        for (elem <- arry1) {
            println(elem)
        }

        println("======================")
//        将数组中的所有数组放在一行中打印  首先可以转换成字符串
        var str=arry1.mkString(",")//可以指定转换成字符串使用什么进行分割
        println(str)
        println("======================")
//        另一种方式使用foreach
        def data(num:Int){
            println(num+"\t")
        }

        arry1.foreach(data)
        println("======================")
        arry1.foreach((a:Int)=>println(a+"\t"))
        arry1.foreach(println(_))
        arry1.foreach(println)
    }
}
