package com.atguigu.scala.base

import java.io.ObjectOutputStream
import java.net.Socket

object ScalaClient {
    def main(args: Array[String]): Unit = {
        val socket = new Socket("localhost", 6666)
        val stream = socket.getOutputStream
//        这里的write方法是将里面的int数据的低八位写入  而不能真正的将超过255的数字写入当到达256就会变成0
        stream.write(500)
//        使用对象输出流输出对象
        val stream1 = new ObjectOutputStream(stream)
        val task = new Task()
        task.num=100
        task.logic=(a:Int) => { a * 2}
        stream1.writeObject(task)
        stream1.flush()
        println("客户端发送成功")
        stream.close()
        socket.close()
    }
}
