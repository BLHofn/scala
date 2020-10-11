package com.atguigu.scala.collection

object ScalaMethod6 {
    def main(args: Array[String]): Unit = {

      //        groupBy  通过指定规则( 通过数据转换为分组key )对数据进行分组
      //        分组后的数据是一个Map集合，key其实就是函数中计算结果，value就是相同key的数据集合
      val words = List("Hello", "Hadoop", "Scala", "Spark","Hive")
      val s1: Map[Char, List[String]] = words.groupBy(_.charAt(0))
      println(s1)
//        s1.flatMap((li:List[String])=>{li.flatten})

//        sortBy  排序  默认使用的是升序
      val nums = List(1,6,4,2,3,5)
      val n1: List[Int] = nums.sortBy(num=>num)
//        使用降序
      val n2: List[Int] = nums.sortBy(num=>num)(Ordering.Int.reverse)
      println(n1)
      println(n2)

//        自定义排序
      val users = List( new User(30,"zhangsan"), new User(20, "lisi"), new User(20, "wangwu") )
      val users1: List[User] = users.sortWith(
          (u1: User, u2: User) => {
              if (u1.age > u2.age) {
                  true
              } else if (u1.age == u2.age) {
                  u1.name > u2.name
              } else {
                  false
              }
          }
      )
      println(users1)
    }
    class User( var age:Int, var name:String ) {
        override def toString: String = {
            s"User[${name}, ${age}]"
        }
    }
}
