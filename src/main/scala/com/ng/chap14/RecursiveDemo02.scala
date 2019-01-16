package com.ng.chap14

import java.text.SimpleDateFormat
import java.util.Date

/**
  * @author cloud9831 
  *         @2019-01-16 22:48 
  */
object RecursiveDemo02 {
  def main(args: Array[String]): Unit = {
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("执行前=" + date) //输出时间

    //递归，测试
    var num = BigInt(1)
    var sum = BigInt(0)
    var res = mx(num, sum)


    println("res=" + res)
    //结束时间
    val now2: Date = new Date()

    val date2 = dateFormat.format(now2)
    println("执行后=" + date2) //输出时间
  }

  def mx(num: BigInt, sum: BigInt): Unit = {
    if (num <= 99999999L) return mx(num + 1, sum + num)
    else return sum
  }
}
