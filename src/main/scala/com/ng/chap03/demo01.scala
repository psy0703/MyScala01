package com.ng.chap03

import scala.io.StdIn

object demo01 {

  def main(args: Array[String]): Unit = {
    var n = (-3)^(-1)
    println(n)

    println("请输入你的姓名：")
    val name = StdIn.readLine()
    println(name)
  }
}
