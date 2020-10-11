package com.atguigu.scala.collection

import scala.collection.mutable

object ScalaSet2 {
    def main(args: Array[String]): Unit = {
        val set1: mutable.Set[Int] = mutable.Set(1,3,5)
        set1.update(9,false)
        println(set1)
//        删除数据
        set1.remove(3)
        println(set1)
    }
}
