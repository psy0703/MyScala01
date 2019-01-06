package com.ng.chap04.Exercises
import scala.util.control.Breaks._
/**
  * @author cloud9831 
  *         @2019-01-06 21:31 
  */
object Exercise03 {
  /*
  某人有100,000元,每经过一次路口，需要交费,规则如下:
    1.当现金>50000时,每次交5%
    2.当现金<=50000时,每次交1000
  编程计算该人可以经过多少次路口

   */
  def main(args: Array[String]): Unit = {
    var money:Double = 100000 //现金数
    var count = 0 //经过路口的次数
    breakable {
      while (money > 0.0) {
        if (money > 50000.0) {
          count += 1
          money -= money * 0.05
        } else {
          count += 1
          money -= 1000
          if (money < 1000) {
            break()
          }
        }
      }
    }
    println(money)
    println( "经过路口的次数为 " + count)

  }
}
