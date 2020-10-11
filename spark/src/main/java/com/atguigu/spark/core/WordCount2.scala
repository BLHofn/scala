package com.atguigu.spark.core

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object WordCount2 {
    def main(args: Array[String]): Unit = {
        //        对spark进行配置  设置他的环境以及app的名称
        val conf=new SparkConf().setMaster("local").setAppName("WordCount")
        //        创建saprk的核心对象
        val sc=new SparkContext(conf)
        val lines: RDD[String] = sc.textFile("mydata/data1.txt")
        val words = lines.flatMap(_.split(" "))
        val map = words.map((_, 1))
//        使用reduceByKey相当于对数据进行分组和聚合
//        它会将相同的key的value进行聚合
        val mapWord = map.reduceByKey(_ + _)
//        val groupWord = words.groupBy(word；l'l => word)
//        val mapWord = groupWord.map {
//            case (word, iter) => {
//                (word, iter.size)
//            }
//        }
        //        使用偏函数对数据进行过滤  在进行遍历输出
        val tuples = mapWord.collect()
        tuples.foreach(println)
        //        关闭资源
        sc.stop()
    }
}
