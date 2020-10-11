package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount1 {
    def main(args: Array[String]): Unit = {
//        对spark进行配置  设置他的环境以及app的名称
        val conf=new SparkConf().setMaster("local").setAppName("WordCount")
//        创建saprk的核心对象
        val sc=new SparkContext(conf)
        val lines: RDD[String] = sc.textFile("mydata/data1.txt")
        val words = lines.flatMap(_.split(" "))
        val groupWord = words.groupBy(word => word)
        val mapWord = groupWord.map {
            case (word, iter) => {
                (word, iter.size)
            }
        }
//        使用偏函数对数据进行过滤  在进行遍历输出
        val tuples = mapWord.collect()
        tuples.foreach(println)
//        关闭资源
        sc.stop()
    }
}
