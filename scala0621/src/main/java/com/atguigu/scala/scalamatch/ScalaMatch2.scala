package com.atguigu.scala.scalamatch

object ScalaMatch2 {
    def main(args: Array[String]): Unit = {
        val age=50
        age match {
            case 10 =>println("age=10")
            case 20 =>println("age=20")
            case 30 =>println("age=30")
//            case _ =>println("other")
        }
    }
}
