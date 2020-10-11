package com.atguigu.scala.collection

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ScalaArray4 {
    def main(args: Array[String]): Unit = {

//        可变数组  创建可变数组的方式
        val arr1: ArrayBuffer[Int] = ArrayBuffer[Int]()
        val arr2: ArrayBuffer[Int] = new ArrayBuffer[Int]()
        val arr3: ArrayBuffer[Int] = new ArrayBuffer[Int]

//        增加数据
        arr1.append(1,3,5,7,9)

//        插入数据  就是要指定在那个位置插入  插入的数据是可变参数类型
        arr1.insert(1,6)

//        修改数据  指定修改那个位置上的数据变为什么
        arr1.update(1,10)
//        这里会产生新的数组
        val ints: ArrayBuffer[Int] = arr1.updated(1,5)
        println(ints.mkString(","))
//        删除数据
        arr1.remove(1)
//        这个是从指定位置删除多少个数据
        arr1.remove(1,2)

//        查询数据
        println(arr1(0))

//        遍历数组
        for (elem <- arr1) {
            println(elem)
        }

//        可变数组和非可变数组的转换
        val buffer = ArrayBuffer(1,2,3,4)
        val array = Array(4,5,6,7)

        // 将不可变数组转换为可变数组
        val buffer1: mutable.Buffer[Int] = array.toBuffer
        // 将可变数组转换为不可变数组
        val array1: Array[Int] = buffer.toArray
    }
}
