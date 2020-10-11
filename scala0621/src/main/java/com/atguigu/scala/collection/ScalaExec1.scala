package com.atguigu.scala.collection

import scala.collection.immutable
import scala.collection.immutable.StringOps
import scala.collection.mutable.ArrayOps

object ScalaExec1 {
    def main(args: Array[String]): Unit = {
//        数据 ：
//        List(
//            ("hello", 4),
//            ("hello spark", 3),
//            ("hello spark scala", 2),
//            ("hello spark scala hive", 1)
//        )
//        要求 ： 1. 将上面的数据进行WordCount后排序取前三名！
//        2. 使用2种不同的方式。
        val tuples = List(
            ("hello", 4),
            ("hello spark", 3),
            ("hello spark scala", 2),
            ("hello spark scala hive", 1)
        )
        val list1: List[String] = tuples.map(kv=>((kv._1+" ")*kv._2))
        println(list1)
        val list2: List[String] = list1.flatMap(_.split(" "))
        println(list2)
        val group: Map[String, List[String]] = list2.groupBy(word=>word)
        println(group)
        val map: Map[String, Int] = group.map(kv => {
            val word: String = kv._1
            val list: List[String] = kv._2
            (word, list.size)
        })
        println(map)
        val list: List[(String, Int)] = map.toList
        val tuples1: List[(String, Int)] = list.sortBy(kv=>kv._2)(Ordering.Int.reverse)
        println(tuples1.take(3))

//        第二种写法
        val tuples2: List[(String, Int)] = tuples.flatMap(kv => {
            val str: StringOps = kv._1
            val num: Int = kv._2
            val words: ArrayOps.ofRef[String] = str.split(" ")
            words.map(
                (_, num)
            )
        })
        println(tuples2)

        val group1: Map[String, List[(String, Int)]] = tuples2.groupBy(kv=>kv._1)
        println(group1)

        val stringToInt: Map[String, Int] = group1.map(kv => {
            val word: String = kv._1
            val list6: List[(String, Int)] = kv._2
            val list7: List[Int] = list6.map(_._2)
            (word, list7.size)
        })
        val list3: List[(String, Int)] = stringToInt.toList
        val tuples3: List[(String, Int)] = list3.sortBy(kv => {
            kv._2
        })(Ordering.Int.reverse)
        println(tuples3)

    }
}
