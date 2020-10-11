package com.atguigu.scala.function

/*
实现九层妖塔
        *
       ***
      *****
     *******
    *********
   ***********
  *************
 ***************
*****************
空格是：8 7  6  5  4  3   2  1  0
*号是： 1 3  5  7  9  11 13 15 17
 */

object Practice {
    def main(args: Array[String]): Unit = {
        val j=1
        for (i <- Range(1, 10)) {
            println((" "*(9-i)) + ("*" * (2*i-1)))
        }
    }
}
