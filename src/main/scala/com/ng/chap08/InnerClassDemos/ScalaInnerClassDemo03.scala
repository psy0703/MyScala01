package com.ng.chap08.InnerClassDemos
import com.ng.chap08

/**
  * 	方式2
  * 内部类如果想要访问外部类的属性，也可以通过外部类别名访问(推荐)。
  * 即：访问方式：外部类名别名.属性名  【外部类名.this  等价 外部类名别名】
  */
object ScalaInnerClassDemo03 {
  def main(args: Array[String]): Unit = {
    //使用一下,创建一个内部类的实例
    val outer1 : ScalaOuterClass3 = new ScalaOuterClass3();
    val inner1 = new outer1.ScalaInnerClass3
    inner1.info()

    val staticINner = new chap08.InnerClassDemos.ScalaOuterClass3.ScalaStaticInnerClass3
  }
}
class ScalaOuterClass3{
  //这样写，你可以理解成这样写，myOuter就是代表外部类的一个对象.
  //如果使用别名，需要将该外部类的属性和方法，放在最后
  myouter =>
  class ScalaInnerClass3 {
    def info(): Unit = {
      // 访问方式：外部类名.this.属性名 ==改成=》  myouter.属性名
      println("name" + myouter.name + "sal = " + myouter.sal)
      myouter.say()
    }
  }

  var name:String = "tom"
  private var sal :Double = 22.2
  private def say(): Unit ={
    println("hello")
  }
}
object ScalaOuterClass3{ //伴生对象
  class ScalaStaticInnerClass3{
    //静态内部类
  }
}