package com.ng.chapter04

import scala.io.StdIn

object MuiltiIfDemo {
  def main(args: Array[String]): Unit = {
    println("请输入当前月份")
    val month = StdIn.readByte() //月份
    val price = 60 //票价
    println("请输入游客年龄")
    val age = StdIn.readShort() //年龄

    if (month >= 4 && month <= 10){
      if(age > 60) {
        println("老人票价为" + price / 3)
      } else if(age >= 18){
        println("成人票价为" + price)
      } else{
        println("儿童票价为" + price / 2)
      }
    } else{
      if (age >= 18 && age <= 60){
        println("成人票价为" + 40)
      } else{
        println("其他票价为" + 20)
      }
    }
  }

}
