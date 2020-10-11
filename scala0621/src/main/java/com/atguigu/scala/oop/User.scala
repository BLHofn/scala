package com.atguigu.scala.oop

object User {
    def main(args: Array[String]): Unit = {
        val user = new MyUser  //这里是通过构造方法创建MyUser对象
        println(user)
        println(MyUser)//这里得到MyUser的伴生对象
        println(MyUser())//这里是通过apply方法构建伴生类MyUser对象
        println(User) //这里是User伴生对象
    }
}
//伴生类
class MyUser{
}

object MyUser{
    def apply(): MyUser = new MyUser()
}
//接口是一种规范或者说特征  不局限于一类事物   抽象类是对某一类事物的抽象