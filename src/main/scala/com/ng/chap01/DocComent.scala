package com.ng.chap01

object DocComent {
  def main(args:Array[String]):Unit = {
    println("ok")

    var a:Int = sum(2 , 3)
    println(a)

  }

  /**
    * 相加的方法
    * @param n1
    * @param n2
    * @return n1 + n2
    * @example 2 + 3 = 5
    */
  def sum (n1: Int , n2: Int): Int ={
    //在scala中，如果没有return ，则以最后一句话的结果为返回值
    n1 + n2
  }
}
