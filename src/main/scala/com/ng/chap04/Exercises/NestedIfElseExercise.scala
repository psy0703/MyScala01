package com.ng.chap04.Exercises

import scala.io.StdIn

/**
  * 潜逃分支
  * 参加百米运动会，如果用时8秒以内进入决赛，否则提示淘汰。并且根据性别提示进入男子组或女子组。
  * 输入成绩和性别，进行判断
  *
  * @author cloud9831 
  *         @2019-01-06 16:14 
  */
object NestedIfElseExercise {

  def main(args: Array[String]): Unit = {
    println("请输入运动会的成绩：")
    val second = StdIn.readFloat()
    println("请输入你的性别： ")
    val gender = StdIn.readChar()
    if (second <= 8.0){
      if (gender == '男'){
        println("进入男子组")
      } else{
        println("进入女子组")
      }
    } else{
      println("很遗憾，你已经被淘汰")
    }
  }
}
