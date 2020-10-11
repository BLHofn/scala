package com.atguigu.scala.oop

object ScalaTrait1 {
    def main(args: Array[String]): Unit = {
        new MyTrait
    }
//    class my{
//        println("6666666")
//    }
    trait MyTrait1  {
        println("1111111")
    }
    trait MyTrait2{
        println("2222222")
    }
    trait MyTrait3 extends MyTrait2 {
        println("3333333")
    }
    trait MyTrait4{
        println("4444444")
    }
//    类混入了trait  就会先加载trait  然后在加载类
    class MyTrait extends MyTrait4 with MyTrait1 with MyTrait2 with MyTrait3{
        println("55555555")
    }
}
