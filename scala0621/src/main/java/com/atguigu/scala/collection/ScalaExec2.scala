package com.atguigu.scala.collection

object ScalaExec2 {
//    reduce只能进行集合内部数据的操作
    def main(args: Array[String]): Unit = {
        val list = List(
            ("Scala", 2),("Hello", 4),("Hello",3),("Scala", 3),("Hello",2),("Hello",1),("XSS",5)
        )
        val group1: Map[String, List[(String, Int)]] = list.groupBy(_._1)
        val stringToInt: Map[String, Int] = group1.map(kv => {
            val word: String = kv._1
            val list1: List[(String, Int)] = kv._2
            list1.reduce((a1, a2) => {
                (a1._1, a1._2 + a2._2)
            })
        })
        println(stringToInt)
    }
}
