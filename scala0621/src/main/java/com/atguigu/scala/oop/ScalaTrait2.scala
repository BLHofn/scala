package com.atguigu.scala.oop
//动态混入
//要遵循ocp（软件实体对扩展进行开放，对修改进行关闭）原则
object ScalaTrait2 {
    def main(args: Array[String]): Unit = {
//        可以通过特质进行扩展  并使用关键字with
        val DB = new MyDB with other
        DB.insert()
        DB.update()
    }
    class MyDB{
//        一个类定义了一个方法在使用很好的情况下
//        如果要增加扩展一个方法  不能对这个类进行修改  要遵守ocp原则
        def insert(): Unit ={
            println("对数据库进行增加数据")
        }
    }
    trait other{
        def update(): Unit ={
            println("对数据库进行修改数据")
        }
    }
}
