package com.atguigu.scala.oop

import java.sql.Date
import java.util

//1、在java中的import是导类  而不是导包  实际上在加载的时候是加载你所需要的类
//在scala中是真正的导包   import java.util    new util.Date()

//2、在Java中import导入一个包中的类用的*  而在Scala中使用的是下划线进行代替

//3、在Scala中如果要导入很多类  在Java中需要很多行  在Scala中可以这样表示  import java.util.{List, ArrayList}

//4、scala中处理不同包中相同名称的类    scala可以在导入类的时候，隐藏类
//        import java.util._       import java.sql.{Date=>_, _}使用这个可以排除这个包中的类     new Date()

// 5. Scala导类基于当前包所在的路径进行导入  就是首先导入当前包中的类
//    如果scala采用绝对路径的方式导入类（使用_root_）   new _root_.java.util.HashMap()

// 6. 可以给类起别名
//import _root_.java.util.{HashMap=>JavaHashMap}
//new JavaHashMap()

// 7. java中默认导入 java.lang包中的类
//    scala中默认导入的包中的类
//    java.lang
//    scala
//    Predef(类) : 类似静态导入 （预先定义）

// 8. 如果自定义了和java重名的类，不起作用。
//    因为类加载器不加载我们自定义的类
//    类加载器中有双亲委派机制。
//    JVM中存在三个类加载器
//    a. 启动类加载器 ：java核心类库
//    b. 扩展类加载器 ：java扩展类库
//    c. 应用类加载器 ：自定义类
object ScalaImport {
    def main(args: Array[String]): Unit = {
        Predef
        // scala : import 是可以导入对象的属性和方法
        //         这种导入对象的方式只能对val声明的对象起作用。
        val userx = new User()
        import userx._

        testUser()
    }
    class User {
        def testUser(): Unit = {
            println("test...")
        }
    }
}
