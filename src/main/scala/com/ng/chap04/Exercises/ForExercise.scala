package com.ng.chap04.Exercises

/**
  * @author cloud9831 
  *         @2019-01-06 18:10 
  */
object ForExercise {
  /*
1.打印1~100之间所有是9的倍数的整数的个数及总和.
2.完成下面的表达式输出
  0 + 6 = 6
  1 + 5 = 6
  ....
 */
  def main(args: Array[String]): Unit = {
    exer1()
    exer2()
  }

  //打印1~100之间所有是9的倍数的整数的个数及总和
  def exer1(): Unit = {
    var sum = 0 //总和
    var count = 0 //个数
    for (i <- 1 to 100) {
      if (i % 9 == 0) {
        count += 1
        sum += i
      }
    }
    printf("1~100之间所有是9的倍数的整数的个数%d 及总和%d\n", count, sum)
  }

  //完成下面的表达式输出
  // 0 + 6 = 6
  // .......
  //思路
  //1. 定义一个变量 max = 6
  //2. 使用一个for循环即可
  def exer2(): Unit = {
    val max = 6
    for (i <- 0 to 6) {
      printf("%d + %d = %d \n", i, max - i, max)
    }
  }
}
/*
1~100之间所有是9的倍数的整数的个数11 及总和594
0 + 6 = 6
1 + 5 = 6
2 + 4 = 6
3 + 3 = 6
4 + 2 = 6
5 + 1 = 6
6 + 0 = 6
 */