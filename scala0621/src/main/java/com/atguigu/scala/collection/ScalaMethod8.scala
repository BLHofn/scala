package com.atguigu.scala.collection

object ScalaMethod8 {
    def main(args: Array[String]): Unit = {
        val list = List(1,2,3,4,5)
//        fold      fold方法支持函数的柯里化     fold方法有2个参数列表
//                  第一个参数列表有一 个参数 ： z(ero) => 初始值
//                  第二个参数列表有一个参数 ： (A1, A1) => A1 => 聚合功能
//        fold  折叠  是解决reduce的弊端
//            reduece的弊端：
//                            1. reduce操作中，第一个数据是无法执行计算的
//                            2. reduce操作中，只能对数据集的内部数据进行处理

//        具体地操作过程  1    1,2,3,4,5
//       （（（（(1+1）+2）+3）+4）+5）=16
        val i1: Int = list.fold(1)(_+_)  //底层是foldLeft
        println(i1)
//        （（（（(1-1）-2）-3）-4）-5）=-14
        val i2: Int = list.fold(1)(_-_)
        println(i2)

//        使用foldRight  具体逻辑：reversed.foldLeft(z)((x, y) => op(y, x))
//        具体操作过程 1  5，4，3，2，1
//        (1-(2-(3-(4-(5-1))))=2
        val i3: Int = list.foldRight(1)(_-_)
        println(i3)

//        scan方法的处理逻辑跟fold一摸一样  只是他将每个过程的值据录下来了  值的存储为值从后往前
        val i4: List[Int] = list.scanRight(1)(_-_)
        println(i4)
        val i5: List[Int] = list.scanLeft(1)(_-_)
        println(i5)
    }
}
