package com.ng.chapter04

import scala.io.StdIn

object MuiltWhileExec {

  var sum = 0 //所有班级总分
  var scoreSum : Int = 0; //每个班总分
  var num :Int = 0 //及格人数

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3){
      println("请输入第" + i + "个班的成绩（每班5个学生）")
      for (j <- 1 to 5){
        println("请输入第" + j +"个学生的成绩：")
        val score = StdIn.readByte() //成绩
        scoreSum += score
        if (score >= 60 ){
          num += 1
        }
      }
      sum += scoreSum
      println("第" + i + "个班的平均成绩：" + scoreSum/5.00)
      scoreSum = 0
    }
    println("所有的及格人数：" + num)
    println("所有班的平均成绩" + sum/15.00)
  }
}
