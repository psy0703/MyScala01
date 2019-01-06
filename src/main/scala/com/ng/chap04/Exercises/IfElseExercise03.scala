package com.ng.chap04.Exercises

import scala.io.StdIn

/**
  * 求ax2+bx+c=0方程的根。a,b,c分别为的变量，如果：b2-4ac>0，则有两个解；
  * b2-4ac=0，则有一个解；b2-4ac<0，则无解，结果保留小数点两位. [a=3 b=100 c=6]
  * 提示1：x1=(-b+sqrt(b2-4ac))/2a
  * X2=(-b-sqrt(b2-4ac))/2a
  * 思路
  *     1. 定义三个变量 a,b,c
  *     2. 因为有三个情况，因此使用多分支
  *
  *     3. 因为 (b2-4ac) 使用5次，因此我们可以使用一个变量m 保存值
  *         @2019-01-06 15:55
  */
object IfElseExercise03 {
  def main(args: Array[String]): Unit = {
    println("请输入a： ")
    val a = StdIn.readDouble()
    println("请输入b")
    val b = StdIn.readDouble()
    println("请输入c")
    val c = StdIn.readDouble()

    val m = b * b - 4 * a * c

    if (m > 0){
      val x1 = (-b - math.sqrt(m)) / (2 * a)
      val x2 = (-b + math.sqrt(m)) / (2 * a)
      printf("x1 = %.2f , x2 = %.2f \n", x1,x2)
    } else if(m == 0){
      val x = (-b) / ( 2 * a)
      printf("x1 = x2 = %.2f" , x)
    } else{
      println("此方程无解。。")
    }
  }
}
