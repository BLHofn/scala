package com.atguigu.scala.collection

import scala.collection.mutable

object ScalaMap1 {
    def main(args: Array[String]): Unit = {
        val tuple: (String, Int) = "a"->1
        println(tuple)
//      不可变map集合
        val map1: Map[String, Int] = Map( "a"->1, "b"->2, "c"->3 )
        println(map1)

//       可变map集合
        val map2: mutable.Map[String, Int] = mutable.Map( "a"->1, "b"->2, "c"->3 )
//        增加数据
        map2.put("d",4)
        println(map2)
//        修改数据
        map2.update("d",6)
        val map3: mutable.Map[String, Int] = map2.updated("e",7)
        println(map2 eq map3)
        println(map3)
        println(map2)
//        删除数据
        map2.remove("a")
        println(map2)
    }
}
