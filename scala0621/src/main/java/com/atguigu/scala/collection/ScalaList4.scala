package com.atguigu.scala.collection

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object ScalaList4 {
    def main(args: Array[String]): Unit = {
        // 可变集合
        val buffer1 = ListBuffer(1,2,3,4)
        val buffer2 = ListBuffer(5,6,7,8)

        // 增加数据
        val buffer3: ListBuffer[Int] = buffer1 :+ 5
        val buffer4: ListBuffer[Int] = buffer1 += 5
        val buffer5: ListBuffer[Int] = buffer1 ++ buffer2
        val buffer6: ListBuffer[Int] = buffer1 ++= buffer2

        println( buffer5 eq buffer1 )
        println( buffer6 eq buffer1 )

        val buffer7: ListBuffer[Int] = buffer1 - 2
        val buffer8: ListBuffer[Int] = buffer1 -= 2
        println( buffer7 eq buffer1 )
        println( buffer8 eq buffer1 )


        val buffer = ListBuffer(1,2,3,4)
        val list = List(5,6,7,8)

        // 可变集合转变为不可变集合
        val list1: List[Int] = buffer.toList
        // 不可变集合转变为可变集合
        val buffern: mutable.Buffer[Int] = list.toBuffer

    }
}
