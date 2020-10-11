package com.atguigu.spark.rdd

import org.apache.spark.{SparkConf, SparkContext}

object CreateSparkRdd1 {
    def main(args: Array[String]): Unit = {
        val conf=new SparkConf().setMaster("local").setAppName("CreaateRdd")
        val sc=new SparkContext(conf)
        val list=List(1,2,3,4,5)
        val rdd1 = sc.parallelize(list)
        val rdd2 = sc.makeRDD(list,3)


        rdd2.saveAsTextFile("output")
        rdd1.foreach(println)
        rdd2.foreach(println)
        rdd1.collect().foreach(println)
        rdd2.collect().foreach(println)
        sc.stop()
    }
}
