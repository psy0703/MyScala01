package com.ng.chap05

/**
  * 递归函数案例2
  */
object RecursiveDemo2 {
  def main(args: Array[String]): Unit = {
    println(fbn(4))
    println("------------------")
    println(f1(2))
    println("peach :" + Peach(1))
  }

  //斐波那契数  求出斐波那契数1,1,2,3,5,8,13...
  //给一个整数n，求出它的斐波那契数是多少？
  /*
  思路
    1. n == 1 或者 n == 2 , 结果就是1
    2. 当n > 2 时，其实值 (n-1) + (n-2)
    3. 翻译代码
   */
  def fbn(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      return fbn(n - 1) + fbn(n - 2)
    }
  }

  //已知 f(1)=3; f(n) = 2*f(n-1)+1;
  //	请使用递归的思想编程，求出 f(n)的值?
  def f1(n: Int): Int = {
    if (n == 1) {
      3
    } else {
      2 * f1(n - 1) + 1
    }
  }

  /*
  猴子吃桃子问题
有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
以后每天猴子都吃其中的一半，然后再多吃一个。
当到第十天时，想再吃时（还没吃），发现只有1个桃子了。
问题：最初共多少个桃子？ 1534
思路 =>规律
  1. 第10天 day10    1
  2. 第9天  (day10 + 1) * 2   = (1 + 1) * 2 = 4
  3. 待8天  (day9 + 1) * 2 = ( 4 + 1) * 2 = 10
  ....

   */
  def Peach(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      2 * (Peach(day + 1) + 1)
    }
  }
}
