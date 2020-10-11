package com.atguigu.scala.oop

object ScalaAbstract1 {
    def main(args: Array[String]): Unit = {

    }
    abstract class Car{
//        属性的抽象
//        在父类中会生成一个抽象的类似于getName的方法
        var name:String
    }
//    abstract class RedCar extends Car {
//        override val name:String="redcar"
//    }
    class MyCar extends Car {
        //        在此处子类实现了父类  并且对抽象的属性进行了赋值
        //        那么子类会生成一个final修饰的属性  并且还会生成一个类似与getName的方法
        //        这就相当于是子类重写了父类当中的getName方法
        //        val name:String="redcar"
        override var name:String="MyCAR"
    }
}
