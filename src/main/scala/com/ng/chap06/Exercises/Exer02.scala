package com.ng.chap06.Exercises

/**
  * 修改上一个程序，编写一个方法中，方法不需要参数，计算该矩形的面积，并将其作为方法返回值。
  * 在main方法中调用该方法，接收返回的面积值并打印(结果保留小数点2位)。
  * @author cloud9831 
  *         @2019-01-07 22:46 
  */
object Exer02 {
  def main(args: Array[String]): Unit = {
    println("area = " + printArea())
    println("----------------------")
    println("area2 = " + printArea(4 , 5))
  }
  def printArea(): Int ={
    val length = 10
    val wide = 8
    for(i <- 1 to length){
      for(j <- 1 to wide){
        print("*")
      }
      println()
    }
    val area = length * wide
    return  area
  }
  //修改上一个程序，编写一个方法，提供m和n两个参数，方法中打印一个m*n的矩形，
  // 再编写一个方法算该矩形的面积(可以接收长len，和宽width)， 将其作为方法返回值。
  // 在main方法中调用该方法，接收返回的面积值并打印
  def printArea(len:Int,width:Int): Int ={
    for(i <- 1 to len){
      for(j <- 1 to width){
        print("*")
      }
      println()
    }
    val area = len * width
    return  area
  }
}
