package com.ng.chap04.Exercises

import scala.io.StdIn

/**
  * if-else练习题
  * 岳小鹏参加scala考试，他和父亲岳不群达成承诺：
  * 如果：
  * 成绩为100分时，奖励一辆BMW；
  * 成绩为(80，99]时，奖励一台iphone7plus；
  * 当成绩为[60,80]时，奖励一个 iPad；
  * 其它时，什么奖励也没有。
  *
  * 说明: 成绩在控制台输入!
  *
  * @author cloud9831
  *         @2019-01-06 15:50 
  */
object IfElseExercise02 {
  def main(args: Array[String]): Unit = {
    println("请输入考试成绩")
    val score = StdIn.readFloat()
    if (score == 100)
      println("奖励一辆BMW")
    else if (score > 80 )
      println("奖励一台iphone7plus")
    else if (score > 60)
      println("奖励一个 iPad")
    else
      println("什么奖励也没有")
  }
}
