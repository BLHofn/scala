package com.atguigu.scala.collection

import java.io.{File, PrintWriter}

import scala.io.{BufferedSource, Source}

object WordCount {
    def main(args: Array[String]): Unit = {
//        第一步读取文件
        val source: BufferedSource = Source.fromFile("mydata/data1.txt")
//        第二步将数据一行一行的读取
//        iterator当中全是一行一行的数据
        val iterator: Iterator[String] = source.getLines()
//        将每一行的数据转换成一个list当中的string
        val list: List[String] = iterator.toList
        source.close()
//        第三步将数据的每一行的单词就空格分割变成一个一个的单词  line==>words
//        需要使用自定义的扁平化  将数据使用空格进行分割
        val list1: List[String] = list.flatMap(_.split(" "))
//        println(list1)
//        第四步将单词进行分组  words==>(word,list)
        val groupWord: Map[String, List[String]] = list1.groupBy(word=>word)
        println(groupWord)
//        第五步将分组后的数据进行map变成自己想要的数据(word,list)==>(word,count)
//        由于上面的数据全是kv键值对  那么可以堪称元组进行使用
        val map: Map[String, Int] = groupWord.map(kv => {
            val word = kv._1
            val li = kv._2
            (word, li.size)
        })
//        println(map)

//        对数据进行排序  由于map是无序的  那么可以转换为list集合
        val list2: List[(String, Int)] = map.toList
        val tuples: List[(String, Int)] = list2.sortBy(kv=>{kv._2})(Ordering.Int.reverse)
//        另一种写法  将整体看成一个参数 就是元组  _._2
        list2.sortBy(_._2)
//        println(tuples)

//        如果要去取前三的数据  可以使用take
        val tuples1: List[(String, Int)] = tuples.take(3)
        println(tuples1)

        //        将数据写入文件
        val writer = new PrintWriter(new File("mydata/data2.txt" ))
        for (elem <- tuples1) {
            println(elem)
            writer.write(elem._1+elem._2+"\n")
        }
        writer.close()
    }
}
