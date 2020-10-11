package com.atguigu.scala.collection

object ScalaMethod5 {
    def main(args: Array[String]): Unit = {
//        如何实现自定义的扁平化  从而实现自定义的数据拆分
//        使用自定的扁平化所使用的函数是flatMap

//        场景将一个list集合中的字符串进行拆分  变成一个一个的单词
        val ss = List("Hello Scala", "Hello Hadoop")
        val str1: List[String] = ss.flatMap((str)=>{str.split(" ")})
        val str2: List[String] = ss.flatMap(_.split(" "))
        for (elem <- str2) {
            println(elem)
        }




//        过滤器filter  根据指定规则将需要的数据过滤出来
        val nums = List(1,2,3,4,5,6)
        val words = List("Spark", "Scala", "Hadoop", "Hive")
        def filterFunction( num:Int ): Boolean = {
            num % 2 != 0
        }
        //val filterList: List[Int] = nums.filter(filterFunction)
        val filterList1 = words.filter( _.charAt(1) == 'c' )
        println(filterList1)
        for (elem <- filterList1) {
            println(elem)
        }
    }
}
