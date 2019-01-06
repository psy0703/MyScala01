package com.ng.chap04

/**
  * for循环守卫--相当于java的continue
  * @author cloud9831 
  *         @2019-01-06 17:43 
  */
object ForGuardDemo {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10 if i != 5){
      println("i = " + i)
    }

    println("----------------")
    val list = List(1,2,3,4,5,6)
    for (i <- list if i != 3){
      println("i = " + i)
    }
  }
}
