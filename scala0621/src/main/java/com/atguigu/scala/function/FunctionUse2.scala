package com.atguigu.scala.function

object FunctionUse2 {
    def main(args: Array[String]): Unit = {
        //        scala的可变参数  类型*  表示可变参数  可变参数的输出结果会被保存在WrappedArray当中
        //1、可变参数的使用
        def f1(name: String*): Unit = {
            println(name)
        }

        f1()
        f1("xxx")
        f1("xxx", "vvv", "ggg")

        //        2、可变参数与普通参数  那么可变参数必须放在普通参数的后面
        //        def f2(name:String*,age:Int): Unit ={
        //        }这种情况程序会报错，加入遇到的都是同种类型  程序无法区分
        //        根本不存在多个可变参数在一起的情况出现
        //        正确写法
        def f2(age: Int, name: String*): Unit = {
            print(age+"\t"+name)
        }
        f2(10,"xxx","sfaf","mafam")
    }
}
