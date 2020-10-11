package com.atguigu.scala.collection

object ScalaMethod2 {
    def main(args: Array[String]): Unit = {
        val list = List(1,2,3,4)

        // 简单计算
        println(list.sum) // 10
        println(list.max) // 4
        println(list.min) // 1
//        计算乘积
        println(list.product) // 24

        // 获取数据
        //从左往右拿数据
        println(list.take(3)) // 拿 1 ， 2， 3
        //
        println(list.takeRight(3))// 2，3，4
        // 方向
        println(list.reverse) // 4,3,2,1

        // 丢弃数据
        //这个参数是丢弃几个数据  然后返回剩下的
        println(list.drop(3))
        println(list.dropRight(2))
//        println("==============================")
        // TODO 从集合中获取一部分数据
        // 第一个(头)
        println("=================================")
        println(list.head)
        // 除了头就是尾
        println(list.tail)
        val tails = list.tails
        for (elem <- tails) {println(elem)}
        // scala中，函数式编程用的最多的算法就是递归
        // 最后一个
        println(list.last)
        // 初始值
        println(list.init)
        println(list.init.init)
        println(list.inits)
        println("==================================")

        val stringList = List("a", "b", "c", "d","a", "b", "c", "d","a", "b", "c", "d")
//        splitAt方法会将数据切分成两半  里面的数字代表第一半里面的数据的数量  剩下的数据在另一半当中
        val tuple: (List[String], List[String]) = stringList.splitAt(7)
        println(tuple._1)
        println(tuple._2)
    }
}
