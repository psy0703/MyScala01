package com.ng.chap04

object IfElseDemo {
  def main(args: Array[String]): Unit = {
    val n1 = 9
    val n2 = 81
    val n3 = 100
    //val res = (n1 > n2) ? n1 :n2 scala不支持三目运算
    //用if-else 替代三目运算

    val res = if (n1 > n2) n1 else n2

    println("res = " + res)

    val res2 = if((if (n1 > n2) n1 else n2) > n3) (if (n1 > n2) n1 else n2) else n3

    println("res2 = " + res2)

  }
}
