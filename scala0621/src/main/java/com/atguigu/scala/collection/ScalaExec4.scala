package com.atguigu.scala.collection

import scala.collection.immutable

object ScalaExec4 {
    def main(args: Array[String]): Unit = {
        // 小练习：不同省份的商品点击排行(降序)
        val list = List(
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "电脑"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "电脑"),
            ("zhangsan", "河南", "电脑"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子")
        )

//        当前的数据格式是（用户，省份，商品)    我们需要的格式是（省份，（商品，点击数））
//        然后可以得到（（省份，商品），点击数）
        val tuples: List[((String, String), Int)] = list.map(t => {
            ((t._2, t._3), 1)
        }).toList
//        println(tuples)

        val group1: List[((String, String), List[((String, String), Int)])] = tuples.groupBy(_._1).toList
//        println(group1)
//        得到（省份，（商品，点击数））
        val tuples1: List[(String, (String, Int))] = group1.map(t => {
            val k: (String, String) = t._1
            val list: List[((String, String), Int)] = t._2
            (k._1, (k._2, list.size))
        })
        println(tuples1)
//        将相同省份数据进行分组
        val stringToTuples: Map[String, List[(String, (String, Int))]] = tuples1.groupBy(_._1)
        println(stringToTuples)

//        如果对元组进行操作  是kv格式  k不变只处理v时可以使用mapValues
        val stringToTuples1: Map[String, List[(String, Int)]] = stringToTuples.mapValues(list => {
            val tuples2: List[(String, Int)] = list.map(_._2)
            //            然后进行排序
            tuples2.sortBy(_._2)(Ordering.Int.reverse)
        })
        println(stringToTuples1)
    }
}
