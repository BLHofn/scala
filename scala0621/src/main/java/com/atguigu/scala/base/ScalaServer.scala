package com.atguigu.scala.base

import java.io.ObjectInputStream
import java.net.ServerSocket

object ScalaServer {
    def main(args: Array[String]): Unit = {
        val socket = new ServerSocket(6666)
//        阻塞等待客户端进行连接
        println("服务器等待客户端连接")
        val client = socket.accept()
        val stream = client.getInputStream
        val i = stream.read()
        println("客户端收到的信息："+i+"\t")
        
//        对象输入流  模仿分布式计算
        val stream1 = new ObjectInputStream(stream)
        val task = stream1.readObject().asInstanceOf[Task]
        val i1 = task.sum()
        println("模拟分布式计算的结果为："+i1)
//        //       获取字符串
//        val reader = new BufferedReader(new InputStreamReader(stream))
//        val str = reader.readLine()
    }
}
