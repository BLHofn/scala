package com.atguigu.scala.collection

object ScalaMethod7 {
    def main(args: Array[String]): Unit = {
//            reduece的弊端：
//                            1. reduce操作中，第一个数据是无法执行计算的
//                            2. reduce操作中，只能对数据集的内部数据进行处理。
//        集合规约 reduce  规约只能在当前集合数据中进行操作
        val list = List(1,2,3,4,5)
//        val list1 = List(3,4,5,6)

//        实际上reduce的底层是reduceLeft
//        具体的reduceleft的操作流程是：
//        1，2，3，4,5
//        加法操作时：((((1+2)+3)+4)+5)=15
//        可以总结为括号从左边开始
        val i1: Int = list.reduce(_+_)
        println(i1)
//        减法操作时：((((1-2)-3)-4)-5)=-13
        val i2: Int = list.reduce(_-_)
        println(i2)

//        使用reduceRight  他的原理是：reversed.reduceLeft[B]((x, y) => op(y, x))
//        首先是先将数据进行反转操作  然后交换当前位置的两个元素的位置进行操作

//        具体操作是进行反转  交换位置
//        1，2，3，4,5  变为  5，4，3，2，1
//        （1+（2+（3+（4+5））））=15
//        可以总结为：括号从右边开始
        val i3: Int = list.reduceRight(_+_)
        println(i3)
//        1，2，3，4,5  变为  5，4，3，2，1
//        （1-（2-（3-（4-5））））=3
        val i4: Int = list.reduceRight(_-_)
        println(i4)
    }
}
