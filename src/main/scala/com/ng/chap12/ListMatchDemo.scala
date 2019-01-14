package com.ng.chap12

/**
  * 匹配列表
  */
object ListMatchDemo {
  def main(args: Array[String]): Unit = {
    for(list <- Array(List(0),List(1,0), List(0, 0, 0), List(88), List(1, 0, 0))){
      val result = list match{
        case 0 ::Nil => "0" //匹配LIst(0)
        case x :: y :: Nil => x + " "+ y // 匹配有两个元素的List
        case x :: Nil => List(x)
        case 0 :: tail => "0..." //匹配以0开头的任意List
        case _ => "something else"
      }
      println(result)
    }
  }
}
