package com.ng.chap07.pkg
//说明
//1. 在一个.scala中可以同时创建多个包
//2. 而且可以在不同包下，创建类

object PkgDemo02 {

}

package com.ng.chap07.aaa{
  //字节码文件完整路径：
  /*E:\IdeaProjects\Scala01\target\classes\com\ng\chap07\pkg\com\ng\chap07\aaa*/

  object Test{

  }
  class Cat //就会编译在com.ng.chap07.aaa

  package object scala {  // 这个是包 com.ng.chap07.aaa.scala 对应的包对象
    val name = "jack"
    def sayOk(): Unit ={
      println("jack say Hi")
    }
    val f1 = () => {
      println("f1()函数")
    }

  }

  package scala {  // 这个又是一个包 com.ng.chap07.aaa.scala
    //在这个scala中，希望可以使用自己再该包中定义的方法，函数或者变量
    //这时，我们可以将 方法，函数或者变量 写入到该包对应的包对象中

    class Tiger //就会编译在com.ng.chap07.aaa.scala
    class Cat ////就会编译在com.ng.chap07.aaa.scala
    object TestCat{
      def main(args: Array[String]): Unit = {
        //因为object TestCat 在  com.atguigu.aaa.scalaz中，因此就可以使用
        //  com.ng.chap07.aaa.scala 包对应的包对象中定义的内容(原理后面说)
        println("name = " + name)
        sayOk()
        f1()

        //在子包中，可以直接使用父包的内容
        // 如果本包有相同类名，则使用就近原则
        val cat = new Cat
        println("cat1 = " + cat)

        //如果希望使用父类的类，则带上类路径
        val cat2 = new com.ng.chap07.aaa.Cat
        println("cat2 = " + cat2)
//        cat1 = com.ng.chap07.pkg.com.ng.chap07.aaa.scala.Cat@66d33a
//          cat2 = com.ng.chap07.pkg.com.ng.chap07.aaa.Cat@5a39699c
      }
    }
  }
}

package scala2 {

}

//包可以嵌套定义，但是推荐不要超过3层
package scala3 {

  package hhh {

    class Dog

  }
}

