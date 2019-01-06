package com.ng.chap04.Exercises
import scala.util.control.Breaks._
/**
  * @author cloud9831 
  *         @2019-01-06 18:41 
  */
object Exercise01 {
  //100以内的数求和，
  // 求出当和 第一次大于20的当前数是多少？【for】请使用循环守卫，完成break的效果？
  def main(args: Array[String]): Unit = {

    var sum = 0
    for ( i <- 1 to 100 ){
      sum += i
    }
    println("sum = " + sum)

    breakable {
      var sum2 = 0
      for(i<- 1 to 100 ){
        sum2 += i
        if (sum2 > 20){
          println(i)
          break()
        }
      }
    }

    var sum3 = 0
    for(i<- 1 to 100 if sum3 > 20){
       sum3 += i
        println(i)
      }

  }
}
