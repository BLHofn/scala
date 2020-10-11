package com.atguigu.scala.oop

// scala中无法实现类属性的默认初始化
// scala为了模仿java的属性的默认初始化，使用下划线赋值
// 此时属性不能使用val声明

// scala在编译类的属性时，其实会编译为私有的属性,并提供属性对应的公共set，get方法
// 在访问属性时，其实等同于调用属性的get方法
// 如果给属性赋值，等同于调用属性set方法

// scala生成属性的set，get方法不符合Bean规范
// 在某些框架（Spring）中会反射调用属性的set,get方法
//如果要生成get和set方法可以使用@BeanProperty
object ScalaField {
    def main(args: Array[String]): Unit = {

    }
}
