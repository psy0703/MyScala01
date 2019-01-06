package com.ng.chap04.Exercises

/**
  * 打印出九九乘法表
  * @author cloud9831 
  *         @2019-01-06 18:38 
  */
object NineNineMultiTable {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 9 ){
      for(j<- 1 to i){
        print( i + " + " + j + " = " + (i * j) + "\t")
      }
      println()
    }
  }

}
