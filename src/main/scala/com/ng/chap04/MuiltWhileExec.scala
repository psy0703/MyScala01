package com.ng.chap04

import scala.io.StdIn

/**
  * 多重循环练习
  */
object MuiltWhileExec {
/*
统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
统计三个班及格人数，每个班有5名同学。
 */
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
