package com.ng.chap04.Exercises

import scala.io.StdIn

/**
  * 嵌套分支练习2
  *
  * @author cloud9831 
  *         @2019-01-06 16:21 
  */
object NestedIfElseExercise2 {
/*
出票系统：根据淡旺季的月份和年龄，打印票价 [考虑学生先做5min]
//scala 没有switch , 分支
4_10 旺季：
	成人（18-60）：60
	儿童（<18）:半价
	老人（>60）:1/3
淡季：
	成人：40
	其他：20
 */
def main(args: Array[String]): Unit = {
  /*
  思路
    1. 定义三个变量 month,age,ticket
    2. 根据提的要求，需要使用到 双分支和嵌套分支
   */
  println("请输入月份")
  val month = StdIn.readByte()
  println("请输入年龄")
  val age = StdIn.readShort()
  println("请输入票价")
  val ticket = StdIn.readFloat()

  var payTicket = 0.0f

  //旺季
  if (month >= 4 && month <= 10){
    if (age > 60){
      payTicket = (ticket / 3).formatted("%.2f").toFloat

    } else if (age >= 18){
      payTicket = ticket
    } else{
      payTicket = (ticket / 2).formatted("%.2f").toFloat
    }
  } else{ //淡季
    if (age >= 18 && age < 60){
      payTicket = 40.0f
    } else{
      payTicket = 20.0f
    }
  }

  printf("出票信息：month: %d , age: %d 应付价格: %.2f",month,age,payTicket)
}
}
