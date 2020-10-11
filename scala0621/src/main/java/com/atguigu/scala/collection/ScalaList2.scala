package com.atguigu.scala.collection

object ScalaList2 {
    def main(args: Array[String]): Unit = {
        // Seq集合
        val list1 = List(1,2,3,4)
        // 空集合
        val list2: List[Nothing] = List()
        val nil  = Nil
        println(list2 eq nil)

        // 创建集合
        val list3: List[Int]  = 1::2::3::Nil
        val list4: List[Int] = list1 ::: Nil

        // 连接集合
        val list5: List[Int] = List.concat(list3, list4)
        list5.foreach(println)

        // 创建一个指定重复数量的元素列表
        val list6: List[String] = List.fill[String](3)("a")
        list6.foreach(println)
    }
}
