package com.atguigu.scala.base

object MyGjz {
      def main(args: Array[String]): Unit = {
    //    如何使用关键字来命名变量  可以使用飘号
    //    var private ="private"   ❌
      var `private`="private"
    //    换行无任何输出
        println()
    //    换行输出内容
        println(`private`)
    //    不换行输出内容
        print(`private`)
    //    传值字符串  不换行
        printf("filed:%s",`private`)
    //    插值字符串
        println(s"fild:${`private`}")
        print(s"fild:${`private`}")
        println()
        printf(s"fild:${`private`}")

        for ( i <- Range(1,5) ) { // 范围集合
          println("i = " + i )
        }
        for ( i <- 1 to 5 ) { // 包含5
          println("i = " + i )
        }
        for ( i <- 1 until 5 ) { // 不包含5
          println("i = " + i )
        }
        
      }
}
