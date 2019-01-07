package com.ng.chap06.Exercises

/**
  * 编写方法：判断一个数是奇数odd还是偶数
  * @author cloud9831 
  *         @2019-01-07 23:41 
  */
object Exer04 {

  def main(args: Array[String]): Unit = {
    oddNum(2)
  }
  def oddNum(num:Int):Unit={
    if (num % 2 == 0){
      println(num + " is a  even number")
    } else {
      println(num  + " is a odd number")
    }
  }
}
