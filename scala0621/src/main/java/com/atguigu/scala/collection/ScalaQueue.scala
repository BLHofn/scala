package com.atguigu.scala.collection

import scala.collection.mutable

object ScalaQueue {
    def main(args: Array[String]): Unit = {
        // Kafka如何保证数据的有序？
        // 分区内有序
        // 分区间无序
        // 1. 将数据发送到一个分区
        // 2. Kafka提供了一个双端队列DeQue

        val que = new mutable.Queue[String]()
        // 添加元素
        que.enqueue("a", "b", "c")
        val que1: mutable.Queue[String] = que += "d"
        println(que eq que1)
        // 获取元素
        println(que.dequeue())
        println(que.dequeue())
        println(que.dequeue())
    }
}
