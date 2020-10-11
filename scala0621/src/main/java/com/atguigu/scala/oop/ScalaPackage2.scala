package com
package atguigu {

    class Test{
        val num1=10
    }
    //    同一个源码的文件中可以直接访问父包中的类（包括属性和方法）  而不需要import
    package bigdata {
        package scala {

            object ScalaPackage2 {
                def main(args: Array[String]): Unit = {
                    def test(): Unit = {
                        println("test...")
                    }
                    test()
                }
            }
        }

    }
}