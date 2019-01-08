package com.ng.chap07

/**
  * Scala访问权限案例
  * @author cloud9831 
  *         @2019-01-08 23:52 
  */
object ScalaVisitDemo {

  def main(args: Array[String]): Unit = {
    val c = new Clerk()
    c.showInfo()

    println(c.name) // c.name() √
    // 从编译器层面，protected 属性，只能在子类，本类，或者 伴生对象访问
//    println(c.job)
    println(c.sal) // c.sal(), private 属性，不能在外边访问,和java

    Clerk.test(c)
  }
}

//类Clerk, 这里Clerk是一个伴生类
//可以将Clerk类的非静态的内容写入到  class Clerk

//结论是
//1. 从形式上看 scala有三种访问修饰符， 默认, protected , private
//2. 属性的修饰符最终都是private
//3. 方法的修饰符，默认是public
class Clerk{
  var name : String = "jack"
  protected var job:String = "doctor"
  //对 private[chapter07] 说明
  //1. private 仍然作用，但是扩大访问范围
  //2. 可以在com.atguigu.chapter07 和它子包下面访问 sal
  private[chap07] var sal :Double = 9999.9

  def showInfo(): Unit ={

    println("name :" + name + "sal =" + sal)
  }

  private def sayHi(): Unit ={
    println("sayHi~~")
  }
}

//object Clerk， 这里的Clerk是 一个伴生对象
//可以将Clerk类的静态的内容写入到  object Clerk
//说明
//1. 在伴生对象中，可以访问伴生类的所有属性和方法
object Clerk{
  def test(c:Clerk): Unit ={
    //这里体现出在伴生对象中，可以访问c.sal
    println("test() name = " + c.name
    + "sal = " + c.sal + "job = " + c.job)
    c.sayHi()
  }
}