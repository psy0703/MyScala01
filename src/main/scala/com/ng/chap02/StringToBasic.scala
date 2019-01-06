package com.ng.chap02

object StringToBasic {

  def main(args: Array[String]): Unit = {

    var str = "hello"

//    println(str.toInt)
//    println(str.toCharArray)
//    println(str.toDouble)
//    println(str.toByte)
//    println(str.toFloat)

    var num1 = "12.5"
    //抛异常 java.lang.NumberFormatException
//    println(num1.toInt)
    //确保String类型能够转成有效的数据
    println(num1.toDouble)
  }
}
