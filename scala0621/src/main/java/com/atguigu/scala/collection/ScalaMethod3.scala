package com.atguigu.scala.collection

object ScalaMethod3 {
    def main(args: Array[String]): Unit = {
        val list1 = List(1,2,3,4,5)
        val list2 = List(3,4,5,6,7,8)
//        求数据的交集，并集，差集
        println(list1.intersect(list2))
        println(list1.union(list2))
//        求差集的时候需要考虑是主要需要那个集合的独有  需要那个那个就是主动者
        println(list1.diff(list2))
        println(list2.diff(list1))

//        zip 拉链  拉链就是两个集合相同位置进行组合  最终的数据大小会以最小长度的集合为准
        println(list1.zip(list2))
        println(list2.zip(list1))

//        滑动  即使会规定一个滑动窗口的大小  然后去取数据  也可以规定窗口滑动的步长
        val iterator: Iterator[List[Int]] = list1.sliding(3)  //这里指定窗口大小为3 没有指定滑动的步长  默认为1
        val iterator1: Iterator[List[Int]] = list1.sliding(3,3)//这里指定窗口大小为3 指定滑动的步长为3
        println("=====================")
        while(iterator1.hasNext){
            println(iterator1.next())
        }
    }
}
