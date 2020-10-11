package com.atguigu.scala.oop

object ScalaAccess {
    protected val num=1
    private [oop] val num2=1
    def main(args: Array[String]): Unit = {
        val obj = new AA()
        //obj.clone() //这里是ScalaAccess调用了obj的clone方法
        // 此处会报错  原因由于当前类和AA类的父类都是object
        // 这里存在一个访问权限的问题  就是方法的提供者和方法的调用者之间的关系

        // 重要提示每一个类都有一个父类他们都叫object  但是只是名字相同  但是每个父类都是独立的  相当于生活中的父子关系（一个儿子一个父亲）
        // 因此方法的提供者是：java.utli.object（这个是AA的父类）   方法的调用者是ScalaAccess  因此不存在子父类关系  所以调用失败

        // 如果不报错  可以让AA重写clone方法
        // 原因：方法的提供者 AA   方法的调用者：ScalaAccess  他们在同一个包下  所以不会报错  符合protected的访问权限


        // scala : scala中访问权限也分4种
        //    private   : 同类
        //    private[包名] ： 包私有
        //    protected   : 受保护的， scala中没有同包的概念，只有子类
        //    （default） : 公共的

        println(num)
    }

    class AA {

    }

}
