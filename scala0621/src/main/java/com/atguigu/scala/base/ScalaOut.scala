package com.atguigu.scala.base

import java.io.{File, PrintWriter}

object ScalaOut {
  def main(args: Array[String]): Unit = {
//    对文件进行写操作
      val writer = new PrintWriter(new File("day01\\src\\main\\java\\com\\atguigu\\scala\\scalaout.txt"))
      writer.write("hello scala")
      writer.close()
  }
}
