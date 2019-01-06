package com.ng.chap03

object ArithmeticDemo {
  def main(args: Array[String]): Unit = {
    var n : Double = 10.0 / 3
    println("n = " + n)
    //如果我们希望将返回的Double,保留到小数点2
    n = n.formatted("%.2f").toDouble
    println("n = " + n)
    //n = 3.3333333333333335
    //n = 3.33
  }
}
