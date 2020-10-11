package com.atguigu.scala.collection

object ScalaArray3 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(1,2,3,4)
        val arr2 = Array(5,6,7,8)
        // 添加数组元素，创建新数组
        val arr3: Array[Int] = arr1 :+ 5
        println( arr1 eq arr3 ) // false
        println(arr3.mkString(","))
        println("========================")

        val arr4: Array[Int] = arr1 ++: arr2
        println(arr4.mkString(","))
        // 添加集合
        val arr5: Array[Int] = arr1 ++ arr2
        println("=======================")
        println(arr5.mkString(","))

//        多维数组
        var myMatrix = Array.ofDim[Int](3,3)
        println("=======================")
        myMatrix.foreach(list=>list.foreach(println))
        // 合并数组
        val arr6: Array[Int] = Array.concat(arr1, arr2)
        println("=======================")
        arr6.foreach(println)

        // 创建指定范围的数组  左闭右开的原则
        val arr7: Array[Int] = Array.range(0,2)
        println("=======================")
        arr7.foreach(println)

        // 创建并填充指定数量的数组  在创建数组时默认指定初始值
        //可以使用到的例子：比如说多个线程去处理多个任务  然后任务完成之后更新数组的值  然后轮询数组是否含有-1来保证任务是否已经完成
        val arr8:Array[Int] = Array.fill[Int](5)(-1)
        println("=======================")
        arr8.foreach(println)

    }
}
