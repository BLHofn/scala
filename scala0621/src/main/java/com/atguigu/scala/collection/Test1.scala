package com.atguigu.scala.collection

object Test1 {
  def main(args: Array[String]): Unit = {
    val list=List((1,"xss1"),(2,"xss2"),(3,"xss3"))
    val tuples1 = list.map(kv => {
      val id = kv._1
      val name = kv._2
      (id - 1, name + "atguigu")
    })
    println(tuples1)
//    使用模式匹配
val tuples = list.map {
  case (id, name) => {
    (id - 1, name + "atguigu")
  }
}
    println(tuples)
  }
}
