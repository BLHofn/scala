package com.atguigu.scala.collection

import scala.collection.mutable

object ScalaArray2 {
    def main(args: Array[String]): Unit = {
////        在声明的时候给数组赋值
//        val ints: Array[Int] = Array(1,2,3,4,5)
//
//        val ints1: Array[Int] = ints :+ 6
//        val ints2: Array[Int] = 6 +: ints
//
//        val value: Array[Int] = ints ++: ints1
//        println(ints.mkString(","))
//        println(ints1.mkString(","))
//        println(ints2.mkString(","))
//        println(value.mkString(","))
        // 多维数组
        var myMatrix = Array.ofDim[Int](4,5)
        myMatrix.foreach(list=>list.foreach(println))
        myMatrix.foreach(ss)

        def ss(ss:Array[Int]): Unit ={
            val len=ss.length
            for(i <- 0 to len-1){
                println(ss(i))
            }
        }

        // 创建矩阵  给二维数组赋值
        for (i <- 0 to 3) {
            for ( j <- 0 to 4) {
                myMatrix(i)(j) = j;
            }
        }
        println("====================")
//        验证ss的遍历实现
        myMatrix.foreach(ss)
    }
}
