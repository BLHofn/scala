package com.atguigu.scala.oop

object ScalaExtends1 {
    def main(args: Array[String]): Unit = {
        val user = new User
    }
    class Person{
        println("person....")
    }
    class User extends Person{
        println("user...")
    }
}