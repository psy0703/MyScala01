package com.ng.chap04

/**
  * for循环之嵌套for循环
  * @author cloud9831 
  *         @2019-01-06 17:51 
  */
object ForNestedDemo {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3 ; j <- 1 to 3){
      println("i = " + i + ", j = " + j)
    }

    println("-------------")
    //等价于
    for (i <- 1 to 3 ){
      for (j <- 1 to 3){
        println(" i =" + i + " j = " + j)
      }
    }
  }
}
/*
i = 1, j = 1
i = 1, j = 2
i = 1, j = 3
i = 2, j = 1
i = 2, j = 2
i = 2, j = 3
i = 3, j = 1
i = 3, j = 2
i = 3, j = 3
 */