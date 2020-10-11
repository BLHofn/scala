package com.atguigu.scala.base

import scala.io.{Source, StdIn}

object ScalaIn {
  def main(args: Array[String]): Unit = {
    //    标准化控制台输入
    var age=StdIn.readInt()
    val str = StdIn.readLine()
//    val str1 = StdIn.readLine(str,args)  这个方法是如何使用的？？？？
    println(age)
    println(str)
//    println(str1)

//    从文件中获取输入
//    getLines()得到的是Iterator[String]对象
    val strings = Source.fromFile("day01\\src\\main\\java\\com\\atguigu\\scala\\AccepetScala.java").getLines()
    for (elem <- strings) {println(elem)}
  }
}
