package com.atguigu.spark.rdd

import org.apache.spark.{SparkConf, SparkContext}

object SparkFile1 {
    def main(args: Array[String]): Unit = {
//        读取一个文件  计算它是如何分区的
        val conf=new SparkConf().setMaster("local").setAppName("File")
        val sc=new SparkContext(conf)
        sc.textFile("mydata/data2.txt",5).saveAsTextFile("output")
        /*
        hello10  0..67
        hadoop4  8..1415
        spark4   16..21
        首先计算他的分区数：文件的总大小为22
        那么他的每一个分区的数据大小为：gogalsize=22/5=4.....2
        所以总的分区数为5+1=6
        他的数据是如何存放的？hadoop读取数据是按照行来读取
        [0,4]    [hello10]
        [4,8]    [hadoop4]
        [8,12]   []
        [12,16]  [spark4]
        [16,20]  []
        [20,24]  []
         */
        sc.stop()
    }

}
