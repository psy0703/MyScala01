package com.ng.chapter04

import scala.io.StdIn

object ifelseDemo {

  def main(args: Array[String]): Unit = {
    println("请输入a")
    var a = StdIn.readDouble()
    println("请输入b")
    var b = StdIn.readDouble()
    println("请输入c")
    var c = StdIn.readDouble()
    println("运算的方程为 " + a + "x^2 + " + b + "x + " + c + " =0")

    var s = b * b - 4 * a * c
    if (s > 0) {
      var x1 = (-b + math.sqrt(s)) / (2 * a)
      var x2 = (-b - math.sqrt(s)) / (2 * a)
      printf("x1=%.2f, x2=%.2f\n", x1, x2)
    } else if (s == 0) {
      var x3 = -b / (2 * a)
      printf("x1= %.2f\n", x3)
    } else {
      println("此方程无解")
    }
  }
}
