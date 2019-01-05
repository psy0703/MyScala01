package com.ng.chap02

object varDemo3 {

  def main(args: Array[String]): Unit = {

    val num1 = 10
    //在scala中不管是值类型(AnyVal)还是引用类型（AnyRef）都是对象
    println(num1.toDouble)
    println(2.toFloat)

    var num2:Float = 1.1f
    println(num2.toString)
    println(num2.toChar)

//    println(f1())

  }

  def f1():Nothing ={
    throw new Exception()
  }

}
