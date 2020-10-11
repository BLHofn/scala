package com.atguigu.scala.collection

object ScalaMethod1 {
    def main(args: Array[String]): Unit = {
//        scala集合通用方法
        val list = List(1,2,3,4,1,2)
//        获取长度
        println(list.length)
        println(list.size)

//        判断集合是否为空
        val empty: Boolean = list.isEmpty
        println(empty)

//        判断集合是否包含某个元素
        println(list.contains(1))

//        集合去重
        val distinct: List[Int] = list.distinct
        println(distinct eq list)
        println(list)
        println(distinct)

//        获取集合的迭代器
        val iterator: Iterator[Int] = list.iterator
        while(iterator.hasNext){
            println(iterator.next())
        }

//        将集合中的数据进行组装  然后可以通过第三方库来将字符串中的数据进行运算
        val str: String = list.mkString("+")
        println(str)

    }
}
