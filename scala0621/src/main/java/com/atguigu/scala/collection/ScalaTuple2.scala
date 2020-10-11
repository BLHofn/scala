package com.atguigu.scala.collection

object ScalaTuple2 {
    def main(args: Array[String]): Unit = {
        // 元组的数据不能修改
        val t: (Int, Int, Int) = (1, 2, 3)


        // 如果元组中的元素只有2个，那么称之为对偶元组，也称之为键值对
        val t1 = ("a", 1)
        // map中存储的就是键值对
        Map("a"->1)
        val tuple: (String, Int) = "a" -> 1
        val tuple1: ((String, Int), Int) = tuple -> 1
        println(tuple)
        println(tuple1)
        println(tuple1 -> 1)

        // 无序
        val map = Map( ("a", 1), ("b", 2), ("c", 3) )
        def test( t : (String, Int) ): Unit = {
            println(t._1 + "=" + t._2)
        }

        map.foreach(test)
        map.foreach((t)=>{println(t._1 + "=" + t._2)})
        map.foreach((t)=>println(t._1 + "=" + t._2))
        map.foreach(t=>println(t._1 + "=" + t._2))

        // 有序
        // map => list
        val list: List[(String, Int)] = map.toList


        // list => map
        // 数据可以重复
        // map中数据的key不能重复
        //val list1 = List(1,2,3,4)
        val list1 = List(
            ("a", 1), ("b", 2), ("a", 3)
        )
        val map1 = list1.toMap

        println(map1)
    }
}
