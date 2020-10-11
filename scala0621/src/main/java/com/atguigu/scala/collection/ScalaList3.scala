package com.atguigu.scala.collection

import scala.collection.mutable.ListBuffer

object ScalaList3 {
    def main(args: Array[String]): Unit = {
        // 可变集合
        val buffer = new ListBuffer[Int]()
        // 增加数据
        buffer.append(1,2,3,4)
        // 修改数据
        buffer.update(1,3)
        // 删除数据
        buffer.remove(2)
        buffer.remove(2,2)
        // 获取数据
        println(buffer(1))
        // 遍历集合
        buffer.foreach(println)

    }
}
