package com.ng.chap04

/**
  * for循环之循环返回值
  * (将for循环当做表达式使用)
  * @author cloud9831
  *         @2019-01-06 17:54 
  */
object ForReturnDemo {
  def main(args: Array[String]): Unit = {
    val res = for (i <- 1 to 10 )yield i * 2
    println("res = " + res)
    //res = Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)


    val res2 = for(i <- 1 to 10 )yield f1(i)
    println("res2 = " + res2)
    //res2 = Vector(1.0, 1.4142135623730951, 1.7320508075688772, 2.0, 2.23606797749979, 2.449489742783178, 2.6457513110645907, 2.8284271247461903, 3.0, 3.1622776601683795)


    /*
    for(i <- 1 to 3; j =  i * 2) {
      println(" i= " + i + " j= " + j)
    }
    可以写成:
     */
    for{i <- 1 to 3
        j = i * 2}{
      println(" i= " + i + " j= " + j)
      //i= 1 j= 2
      // i= 2 j= 4
      // i= 3 j= 6
    }
  }
  def f1 (n :Int):Double = {
    math.sqrt(n.toDouble)
  }
}
