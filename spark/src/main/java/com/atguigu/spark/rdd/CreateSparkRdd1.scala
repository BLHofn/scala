package com.atguigu.spark.rdd

import org.apache.spark.{SparkConf, SparkContext}

object CreateSparkRdd1 {
    def main(args: Array[String]): Unit = {
        val conf=new SparkConf().setMaster("local[*]").setAppName("CreaateRdd")
        val sc=new SparkContext(conf)
        val list=List(1,2,3,4,5)
        val rdd1 = sc.parallelize(list)
        // makeRDD 第一个参数表示数据源，是Seq类型
        // makeRDD 第二个参数存在默认值，可以在调用时不传递
        //         表示分区的数量，默认值为: 默认并行度

        //         这里的默认值分为两种情况
        //         1. 本地模式：从sparkConf取配置，如果取不到，会使用当前环境下总核数
        //                      scheduler.conf.getInt("spark.default.parallelism", totalCores)
        //         2. 集群模式 : conf.getInt("spark.default.parallelism", math.max(totalCoreCount.get(), 2))
        val rdd2 = sc.makeRDD(list)
        rdd2.distinct()


        rdd2.saveAsTextFile("output")
        rdd1.foreach(println)
        rdd2.foreach(println)
        rdd1.collect().foreach(println)
        rdd2.collect().foreach(println)
        sc.stop()
    }
}
