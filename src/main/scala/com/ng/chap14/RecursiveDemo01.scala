package com.ng.chap14

import java.text.SimpleDateFormat
import java.util.Date

/**
  * 计算1-99999999l的和
  * 常规的解决方式
  *
  * @author cloud9831
  *         @2019-01-16 22:38 
  */
object RecursiveDemo01 {
  def main(args: Array[String]): Unit = {
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("执行前的时间 ： " + date)

    var res = BigInt(0)
    var num = BigInt(1)
    var maxVal = BigInt(99999999L)
    while (num <= maxVal) {
      res += num
      num += 1
    }
    println("res =  " + res)
    //结束时间
    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("执行后的时间： " + date2)
  }
}
