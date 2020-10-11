package com.atguigu.scala.oop

object ScalaTrait {
    def main(args: Array[String]): Unit = {
        val mysql: MySQL = new MySQL
        mysql.operData()
    }
}

trait Operate {
    def operData(): Unit = {
        println("操作数据。。")
    }
}

trait DB extends Operate {
    override def operData(): Unit = {
        print("向数据库中....")
        super.operData()
    }
}

trait Log extends Operate {

    override def operData(): Unit = {
        print("向日志文件中....")
        //        SUPER的含义就是找自己的上一级  在编译的时候super直接变成了上一级哪个类
        //        在Java中上一级就是自己的父类
        //        在Scala中  存在特质的叠加  因此super并不代表自己的父类只能代表我们的上一级

        // 功能叠加
        // 混入多个特质时，如果不同的特质存在相同的方法，那么就需要将这些功能叠加在一起
        // 叠加顺序？
        // 特质的叠加顺序为从右向左执行。
        // 最后混入的特质功能先执行。

        // super : 其实不是表示父类对象，仅仅是一种关联
        //         在特质使用时，表示上一个的特质，而不是父类特质
        //         如果想要改变功能叠加的顺序，不是找上一个，而是找父特质。需要更改顺序
        //         比如说直接在调用的时候指明自己的上一级  super[Operate].operData()
        super.operData()
//        super[Operate].operData()
    }
}

class MySQL extends DB with Log {
    println("MYSQL....")
}