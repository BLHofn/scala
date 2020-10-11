package com.atguigu.scala.function

object FunctionUse3 {
    def main(args: Array[String]): Unit = {
        //        我们的函数中的所有参数默认是使用val修饰的  是不可以修改的
        //        比如说：
        def login(passwd: String = "000000"): Unit = {
            //            passwd="88888"  //因为函数的参数是使用val修饰的  因此在函数中无法修改
            //            因此在声明参数时候可以设置默认值
            //            在使用的过程当中，如果你想使用默认值，则可以不用传递参数
            //                             如果你不想使用默认值，那么你可以使用传入参数去覆盖我们的默认值
            println(passwd)
        }

        login() //不写是使用参数的默认值
        val unit = login("666666")
        println(unit)

        //    第二种  加入一个参数有默认值  一个参数没有默认值
        //        如何使用默认值，然后又能传入第二个参数
        //        正常情况如果你想使用默认值  你可以不用传入参数  但是由于有多个参数会进行一一匹配  此时是行不通的
        //        解决方案：使用默认值  然后第二个参数你需要指定那个参数是谁才可以正常进行  reg(name = "xss")
        def reg(password: String = "123123", name: String): Unit = {
            println(name + "," + password)
        }

        reg(name = "xss")
    }
}
