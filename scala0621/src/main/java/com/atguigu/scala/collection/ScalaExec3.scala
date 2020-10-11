package com.atguigu.scala.collection

object ScalaExec3 {
    def main(args: Array[String]): Unit = {
//        将两个集合的数据进行wordcount  由于reduce具有局限性  只能进行集合内部操作
//        使用fold可以在集合外部引入其他数据跟当前集合的数据进行操作
        val map1 = Map(
                ("Scala", 2),("Hello", 4)
            )
        val map2 = Map(
                ("Scala", 3),("Hello", 5),("Spark",2)
            )
//        map1.fold()  不可以使用要求传入的参数要一样  但是我们传入的参数一个是集合另一个是另一个集合的一部分
        val stringToInt: Map[String, Int] = map1.foldLeft(map2)((map, kv) => {
            val key: String = kv._1
            val newNum: Int = kv._2
            val oldNum: Int = map.getOrElse(key, 0)
            //            (key,newNum+oldNum)
            map.updated(key, oldNum + newNum)
        })
        println(stringToInt)
}
}
