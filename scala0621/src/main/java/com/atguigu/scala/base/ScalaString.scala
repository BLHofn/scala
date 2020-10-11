package com.atguigu.scala.base

object ScalaString {
  def main(args: Array[String]): Unit = {
    var name="jack"
//    |为默认顶格符  就是相当于控制台左端的边缘
//    如果不使用|  那么就是使用默认的距离来进行
//    多行字符串
    val str=
      s"""
        |hello
        | word
        | $name
        hahah
        |""".stripMargin
        println(str)
      val a = new String("abc")
      val b = new String("abc")

      println(a == b)
      println(a.equals(b))
      println(a.eq(b))
  }
}
