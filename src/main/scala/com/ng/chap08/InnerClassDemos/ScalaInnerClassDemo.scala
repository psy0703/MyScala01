package com.ng.chap08.InnerClassDemos
import com.ng.chap08

/**
  * 定义Scala 的成员内部类和静态内部类，并创建相应的对象实例
  */
object ScalaInnerClassDemo {
  def main(args: Array[String]): Unit = {
    //使用: 创建两个ScalaOuterClass实例
    val outer1:ScalaOuterClass = new ScalaOuterClass
    val outer2:ScalaOuterClass = new ScalaOuterClass

    //创建内部类对象
    val inner1 = new outer1.ScalaInnerClass
    val inner2 = new outer2.ScalaInnerClass
    /*
    1.Scala创建内部类的方式和Java不一样，将new关键字放置在前，使用  对象.内部类  的方式创建
    2. 注意，从这种创建方式我们可以看出: scala的内部类对象和外部类对象是关联的
    3. 因为这个原因：scala有一个新的知识点->类型投影
     */
    println(inner1)
    println(inner2)

    //创建静态内部类对象，这个和Java一样
    val staticInnerClass = new chap08.InnerClassDemos.ScalaOuterClass.ScalaStaticInnerClass()
    println(staticInnerClass)
    /*
    com.ng.chap08.InnerClassDemos.ScalaOuterClass$ScalaInnerClass@ea4a92b
    com.ng.chap08.InnerClassDemos.ScalaOuterClass$ScalaInnerClass@3c5a99da
    com.ng.chap08.InnerClassDemos.ScalaOuterClass$ScalaStaticInnerClass@47f37ef1
     */
  }
}

class ScalaOuterClass {  //伴生类 -》 外部类
  class ScalaInnerClass{
    //成员内部类
  }
}
object ScalaOuterClass{ //伴生对象
  class ScalaStaticInnerClass{
    //静态内部类
  }
}