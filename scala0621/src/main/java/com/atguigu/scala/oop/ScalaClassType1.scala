package com.atguigu.scala.oop
//判断两个对象是否相同
//在Scala中：
//          equals方法比较的是值是否相等
//          eq方法进行的是引用比较，比较两个对象的引用是否相同
//如果要比较对象的引用是否相同或者不同，请用eq或ne方法
//如果要比较值是否相等，请用equals方法或者==方法，这里推荐使用==方法，因为如果比较值为null的情况下，调用equals方法是会报错的，
// 而==方法则避免了这个问题，它事先为我们检查了是否为null，然后在进行相应比较

//在java中：
//    1）对于==，如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；
//　　　　如果作用于引用类型的变量，则比较的是所指向的对象的地址
//　　2）对于equals方法，注意：equals方法不能作用于基本数据类型的变量
//　　　　如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；
//　　　　诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容。
object ScalaClassType1 {
    def main(args: Array[String]): Unit = {
        val user1 = new  User
        user1.id=1
        val user2 = new  User
        user2.id=1
        println(user1 eq user2)
        println(user1.equals(user2))
        println(user1==user2)
        println(user1 ne user2)
        println("====================")

        val user3 = new User(2)
        val user4 = new User(2)
        println(user3 eq user4)
        println(user3.equals(user4))
        println(user3==user4)
        println(user3 ne user4)

        println("=================")
//        println(null.equals(new String))
        val str1 = new String
        val str2 = str1
        println(str1==str2)
    }
    class User(){

        var id:Int= _
        def this(num:Int){
            this()
        }
        override def equals(obj: Any): Boolean = {
//            super.equals(obj)
            if (obj.isInstanceOf[User]){
                val user: User = obj.asInstanceOf[User]
                user.id==this.id
            }else{
                false
            }
        }
    }
}
