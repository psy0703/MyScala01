package com.ng.chap04.Exercises

import scala.io.StdIn

object ifelseExer {
  /*
    求ax2+bx+c=0方程的根。a,b,c分别为的变量，如果：b2-4ac>0，则有两个解；
  b2-4ac=0，则有一个解；b2-4ac<0，则无解，结果保留小数点两位. [a=3 b=100 c=6]
  提示1：x1=(-b+sqrt(b2-4ac))/2a
         X2=(-b-sqrt(b2-4ac))/2a
  提示2：sqrt(num)  在 scala 包中(默认引入的) 的math 的包对象有很多方法直接可用.
     */
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
