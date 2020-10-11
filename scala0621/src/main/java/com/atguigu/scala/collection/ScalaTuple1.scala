package com.atguigu.scala.collection

object ScalaTuple1 {
    def main(args: Array[String]): Unit = {

        // tuple就是将许多没有任何关联的数据放在一起的当成一个整体  使用是使用（）包起来即可

        //元组集合的数据容量最多为22个
        // 这里说的数据容量为22个，有限制，但是存储的数据类型没有限制
        //        val tuple = (1, "zhangsan", 30,40,
        //        1, "zhangsan", 30,40,1, "zhangsan",
        //        30,40,1, "zhangsan", 30,40,1,
        //        "zhangsan", 30,40,1, "zhangsan", 30,40)
        // 元组由于不知道数据的含义，所以如果想要访问数据，那么只能通过顺序
        // 顺序号的最大值应该和元素的数量保持一致
        //println(tuple)
        val tuple: (Int, String, Int, Int) = (1, "zhangsan", 30, 40)
        println(tuple._1)
        println(tuple._2)
        println(tuple._3)
        println(tuple._4)
        println("======================")
//        获取元组的迭代器
        val iterator: Iterator[Any] = tuple.productIterator
        while(iterator.hasNext){
            println(iterator.next())
        }

//        根据索引的方式获取元组中的数据
        val t1: Any = tuple.productElement(0)
        println(t1)
    }
}
