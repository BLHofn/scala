package com.atguigu.scala.base

class Task extends Serializable {
    var num = 20

    var logic:(Int) => Int = _
    def sum():Int={
        logic(num)
    }
}
