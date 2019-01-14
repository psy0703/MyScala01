package com.ng.chap12.caseClass

/**
  * 样板类
  * 1)	样例类仍然是类
  * 2)	样例类用case关键字进行声明。
  * 3)	样例类是为模式匹配(对象)而优化的类
  * 4)	构造器中的每一个参数都成为val——除非它被显式地声明为var（不建议这样做）
  * 5)	在样例类对应的伴生对象中提供apply方法让你不用new关键字就能构造出相应的对象
  * 6)	提供unapply方法让模式匹配可以工作
  * 7)	将自动生成toString、equals、hashCode和copy方法(有点类似模板类，直接给生成，供程序员使用)
  * 8)	除上述外，样例类和其他类完全一样。你可以添加方法和字段，扩展它们
  */
object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    println("case class")
  }
}
abstract class Amout
//说明
//1. 一个样例类，在底层会生成两个.class
//2 一个是  Dollar.class ,对应的是 非静态的内容，可以理解就是伴生类
//  ，会生成很多方法(copy,hashcode, toString...)
//3. 一个是 Dollar$.class , 对应是静态类型，可以理解成是伴生对象
//  , 会生成很多方法，比如(apply, unapply方法)
case class Dollar(value:Double)extends Amout{
  val name:String = "hello" //属性
  def cry(): Unit ={
    println("ok")
  }
}

case class Currency(value:Double,unit:String) extends Amout

case object NoAmout extends Amout