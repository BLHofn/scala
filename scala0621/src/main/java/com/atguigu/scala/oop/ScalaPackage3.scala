package com
//package也可以当成对象  可以声明属性和方法

//1. 位置 : scala源码路径和所在包没有关系,编译后会自动生成对应类文件路径
//2. 关键字 ： package关键字可以重复使用, 形成层次感
// 3. 层次感 ： package关键字的后面可以使用花括号增加封装
// 4. 上下级 ：同一个源码文件中，子包访问父包中的内容，无需导入，可以直接使用
//5. 面向对象 ： scala语言是完全面向对象，所以包也能当成对象来用
//6. 类名 ： java中要求完整类名和文件名保持一致，scala没有要求
package object atguigu {
    val name : String = "zhangsan"
    def test(): Unit = {
        println( name )
    }
}
    package bigdata {
        package scala {

            object ScalaPackage3 {
                def main(args: Array[String]): Unit = {
                    println(atguigu.name)

                    def test(): Unit = {
                        println("test...")
                    }
                    test()
                }
            }
        }
    }