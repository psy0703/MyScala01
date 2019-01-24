package com.ng.chap17
import java.lang

/**
  * 1) 编写一个通用的类，可以进行Int之间、Float之间等实现了Comparable接口的值直接的比较./
  * 2) 分别使用传统方法和上界的方式来完成，体会上界使用的好处.
  */
object UpperBoundsDem01 {
  def main(args: Array[String]): Unit = {
    val compareInt = new CompareInt(10,30)
    println(compareInt.greater) // 30

    val compareFloat = new CompareFloat(1.1f, 7.1f)
    println(compareFloat.greater) // 7.1f

    //使用上界来完成比较
    val com1 = new CommonCompare[Integer](20,30)
    //new CompareComm(Integer.valueOf(20), Integer.valueOf(40))
    println(com1.greater)

    val com2 = new CommonCompare[lang.Float](21.1f,33.3f)
    //new CompareComm(java.lang.Float.valueOf(20.1f), java.lang.Float.valueOf(42.3f))
    println(com2.greater)
  }
}

//一个类 CompareInt
//1. 接收 两个Int
//2. 一个方法 greater 返回较大的值
class CompareInt(n1: Int, n2: Int) {
  def greater = if (n1 > n2) n1 else n2
}

//传统写法，如果比较Float
class CompareFloat(n1: Float, n2: Float) {
  def greater = if (n1 > n2) n1 else n2
}

//使用上界来实现
class CommonCompare[T <: Comparable[T]](n1: T, n2: T) {
  def greater = if (n1.compareTo(n2) > 0) n1 else n2
}
