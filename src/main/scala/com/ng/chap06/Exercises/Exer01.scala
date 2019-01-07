package com.ng.chap06.Exercises

/**
  *
编写类(MethodExec)，
编程一个方法，方法不需要参数，在方法中打印一个10*8 的矩形，在main方法中调用该方法
  * @author cloud9831 
  *         @2019-01-07 22:40 
  */
object Exer01 {
  def main(args: Array[String]): Unit = {
    printRactangle()
  }

  def printRactangle(): Unit ={
    for(i <- 1 to 10){
      for(j <- 1 to 8){
        print("*")
      }
      println()
    }
  }
}
