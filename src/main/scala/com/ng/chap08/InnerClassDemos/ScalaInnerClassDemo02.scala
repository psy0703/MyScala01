package com.ng.chap08.InnerClassDemos

import com.ng.chap08

/**
  * 在内部类中访问外部类的属性和方法两种方法。
  * 	方式1
  * 内部类如果想要访问外部类的属性，可以通过外部类对象访问。
  * 即：访问方式：外部类名.this.属性名
  */
object ScalaInnerClassDemo02 {
  def main(args: Array[String]): Unit = {
    val outer1 = new ScalaOuterClass2
    val inner1 = new outer1.ScalaInnerClass2
    val staticInner1 = new chap08.InnerClassDemos.ScalaOuterClass2.ScalaStaticInnerClass2()

    inner1.info()
    println(staticInner1)
    /*
    name = jacksal = 1.2
    heiheihei
    com.ng.chap08.InnerClassDemos.ScalaOuterClass2$ScalaStaticInnerClass2@2c8d66b2
     */
  }
}
class ScalaOuterClass2{ //外部类
  var name :String ="jack"
  private var sal :Double =1.2  //私有属性
  private def cry(): Unit ={  //私有方法
    println("heiheihei")
  }
  class ScalaInnerClass2{ //成员内部类
    def info (): Unit ={ //内部类的方法
      // 访问方式：外部类名.this.属性名
      // 怎么理解 ：ScalaOuterClass.this 就相当于是 ScalaOuterClass 这个外部类的一个实例,
      // 然后通过 ScalaOuterClass.this 实例对象去访问 name 属性
      // 理解:外部类名.this 就是一个外部类实例，如果是java可能这样理解 ScalaOuterClass.class
      println("name = " + ScalaOuterClass2.this.name
      + "sal = " + ScalaOuterClass2.this.sal)

      ScalaOuterClass2.this.cry()
    }
  }
}

object ScalaOuterClass2{ //伴生对象
  class ScalaStaticInnerClass2{
    //静态内部类
  }
}