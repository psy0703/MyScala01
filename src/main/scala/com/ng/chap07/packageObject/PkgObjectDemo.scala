package com.ng.chap07.packageObject

/**
  * @author cloud9831 
  *         @2019-01-08 23:50 
  */
object PkgObjectDemo {

}
package com.ng.chap07.aaa2{
  package object scala2 {
    val name = "jack"

    def sayOk(): Unit = {
      println("jack sayOk")
    }

    val f1 = () => {
      println("f1函数")
    }
  }

  package scala2 {

    object TestOb {
      def main(args: Array[String]): Unit = {
        //因为object TestCat 在  com.atguigu.aaa.scalaz中，因此就可以使用
        //  com.atguigu.aaa.scala 包对应的包对象中定义的内容(原理后面说)
        println("name=" + name)
        sayOk()
        f1()
      }

    }

  }

  package object scala3 { //com.atguigu.aaa2.scala3.package 和 pacakge$

  }

  package scala3 { //com.atguigu.aaa2.scala3

  }

}