package com.ng.chap04

import scala.io.StdIn

/**
  * @author cloud9831 
  *         @2019-01-06 15:31 
  */
object IfElseDemo02 {
  //多分支，不管有多少个判断，只能有一个执行的入口
  def main(args: Array[String]): Unit = {
    println("please input your score：")
    val score = StdIn.readShort()

    if (score > 80) {
      println("score>80")
    } else if (score > 70) {
      println("score>70")
    } else {
      println("xxx")
    }
  }
}
