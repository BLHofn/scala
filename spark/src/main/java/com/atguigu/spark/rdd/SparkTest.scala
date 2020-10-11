package com.atguigu.spark.rdd

import org.apache.spark.{SparkConf, SparkContext}

object SparkTest {
//    将一个文件中的数据的url提取出来
    def main(args: Array[String]): Unit = {
        val conf=new SparkConf().setMaster("local").setAppName("Test")
        val sc=new SparkContext(conf)
        val log = sc.textFile("mydata/apache.log")
        val rdd = log.map(log => {
            val datas = log.split(" ")
            datas(6)
        })
        rdd.collect().foreach(println)
    }
}
