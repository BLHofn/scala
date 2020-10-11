package com.atguigu.scala.oop

import java.lang.reflect.Field

object ScalaClassType {
    def main(args: Array[String]): Unit = {
        val c: Class[String] = classOf[String]
        val fields: Array[Field] = c.getDeclaredFields
        for (elem <- fields) {
            println(elem)
        }
        val name: String = c.getCanonicalName
        println(name)
    }
}
