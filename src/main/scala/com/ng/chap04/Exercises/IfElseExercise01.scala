package com.ng.chap04.Exercises

import scala.io.StdIn

/**
  * 判断输入的年份是否是闰年，闰年的条件是符合下面二者之一：
  * (1)年份能被4整除，但不能被100整除；(2)能被400整除
  *
  * @author cloud9831 
  *         @2019-01-06 15:47 
  */
object IfElseExercise01 {
  def main(args: Array[String]): Unit = {
    println("请输入年份： ")
    val year = StdIn.readShort()
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
      println(year + "年是闰年" )

    }else {
      println( year + "年不是闰年")
    }
  }
}
