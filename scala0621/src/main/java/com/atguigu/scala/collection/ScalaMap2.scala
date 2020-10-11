package com.atguigu.scala.collection

import scala.collection.mutable

object ScalaMap2 {
    def main(args: Array[String]): Unit = {
        // TODO 集合 - Map - 可变
        val emptyMap: Map[String, Int] = Map.empty[String, Int]

        val map = Map("a"->1)
        val i: Int = map.apply("a")
        val j: Int = map("a")

//        val i1: Int = map("b")

        val get: Option[Int] = map.get("b")
        println(get)
        // 使用apply方法从map中获取指定key的value
        // 如果指定的key不存在，那么会发生错误
        // java.util.NoSuchElementException: key not found: b
        //val i: Int = map("b")

        // Option : 选项类型
        //     Some : 有值
        //     None : 无值
        // 选项类型出现的目的其实就是为了避免空指针异常
        // val maybeInt: Option[Int] = map.get("b")

        //        if ( maybeInt.isEmpty ) {
        //            println("指定的key不存在")
        //        } else {
        //            val value: Int = maybeInt.get
        //            println("指定的key的值为" + value)
        //        }

        // 如果从map中获取不到值，希望有默认值
        val i2: Int = get.getOrElse(0)
        println(i2)

        // map集合简化了这个操作
        //val i: Int = map.getOrElse("b", 0)

        val map1 = mutable.Map("b"->2)

        // 可变map集合有clear方法
        //map1.clear()

        //val keys: Iterable[String] = map1.keys
        //val values: Iterable[Int] = map1.values
        //map1.keysIterator
        //map1.valuesIterator

        //println(i)

    }
}
