package com.ng.chap10

/**
  * 操作符的重载
  * @author cloud9831 
  *         @2019-01-12 21:45 
  */
object OperatorOverload {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    println(cat.age)
    cat += 10
    println(cat.age) //20
  }
}
class Cat {
  var age:Int = 10
  def +=(n:Int): Unit ={
    this.age += n
    println("xxx")
  }
}