package com.ng.chap04

/**
  * for循环之引入变量
  * @author cloud9831 
  *         @2019-01-06 17:47 
  */
object ForImportVar {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3; j = 4 - i){
      println("j = " + j)
    }

    println("----------------")
    //等价于
    for(i <- 1 to 3){
      val j = 4 - i
      println("j " + j )
    }
  }
}
