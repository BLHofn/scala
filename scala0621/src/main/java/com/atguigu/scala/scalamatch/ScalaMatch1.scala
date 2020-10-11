package com.atguigu.scala.scalamatch

object ScalaMatch1 {
    def main(args: Array[String]): Unit = {
        val age = 20

        // 模式匹配
        // 1. scala中模式匹配的操作是自动跳出的，不需要break操作
        // 2. 下划线表示除了上面的条件外的任意值。类似于java中的default
        //    模式匹配从上到下依次匹配
        //    需要将下划线的分支放置在最后
        // 3. 如果所有的分支条件都不成立，那么会发生错误，MatchError
        age match {
            //case _ => println("other")
            case 10 => println("age = 10")
            case 20 => println("age = 20")
            case 30 => {
                println("age = 30")
            }

        }

//        println(List(1).tail)
    }
}
