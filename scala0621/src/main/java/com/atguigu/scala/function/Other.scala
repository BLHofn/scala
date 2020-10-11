package com.atguigu.scala.function

import scala.collection.immutable.Range
import scala.util.control.Breaks

object Other {
//    在Scala中  声明在类中的函数被称为方法
//    声明在其他位置的就是函数
    def main(args: Array[String]): Unit = {
    // 表达式会将满足条件的最后一行代码的执行结果返回
    // 如果没有任何一个条件满足，那么返回的是Unit
    var age=20
    val unit1 = if (age < 30) {
        println("你的年龄太小了")
    }

    val value = if (age<15){
        print("1123")
    }else{
        null
    }

//    循环返回值
// for表达式默认情况下返回Unit
// for循环使用yield关键字可以将每一次循环的结果保存到集合中，最后一次性返回集合
    val unit = for (i <- Range(1,5))yield {
        i
    }

    println(unit)
    println(unit1)
    // 字符串可以当成char数组使用
    for ( i <- "Hello World" ) {
        println(i)
    }

//    scala中的break和continue
    Breaks.breakable{
        for (i <- 1 to 5){
            if (i==3){
                //      break()方法的源代码为：def break(): Nothing = { throw breakException }
                //     他会抛出异常而且中断当前的main，因此要使用Breaks.breakable{}来捕获异常让main不会受影响正常进行
//                Breaks.breakable  源代码：try {
                //      op
                //    } catch {
                //      case ex: BreakControl =>
                //        if (ex ne breakException) throw ex
                //    }
                Breaks.break();
            }
            println(i)
        }
    }
}
}
