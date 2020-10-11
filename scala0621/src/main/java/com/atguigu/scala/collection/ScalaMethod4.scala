package com.atguigu.scala.collection

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.reflect.internal.util.StringOps

object ScalaMethod4 {
    def main(args: Array[String]): Unit = {
//        scala 功能函数
//        1、转换  映射函数map  主要将数据转换成自己需要的数据
      val list = List(1,2,3,4)
      def test(num:Int): Int ={
          num*2
      }
      val list1: List[Int] = list.map(test)
      val list2: List[Int] = list.map(_*2)
//      println(list1)
//      println(list2)

//        2、扁平化  flatten  就是将一个数据拆分成一个一个的个体进行使用
//        比如说 //val list1 = List(1,2,3)   list1:::Nil => List(1,2,3)  list1::Nil => List(List(1,2,3))
//        ：：：就类似于扁平化  他会将集合进行拆分变成一个一个数据进行使用  ：：只是将一个集合当成一个整体进行使用
      val list3: List[List[Int]] = List(
      List(1, 2), List(3, 4)
)
      val list4 = List(
        List(
          List(List(1, 2))
        ), List(
          List(3, 4)
        )
      )
//      println(list3)
      val flatten1 = list4.flatten
      val flatten2 = flatten1.flatten
      println(flatten1)
      println(flatten2)


      val list5: mutable.MutableList[List[Int]] = mutable.MutableList(List(1,2),List(3,4))
      val flatten: mutable.MutableList[Int] = list5.flatten
//      println(flatten)
//      println(list5)
    }
}
