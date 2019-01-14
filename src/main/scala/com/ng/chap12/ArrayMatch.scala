package com.ng.chap12

import scala.collection.mutable.ArrayBuffer

/**
  * 匹配数组
  * 1)	Array(0) 匹配只有一个元素且为0的数组。
  * 2)	Array(x,y) 匹配数组有两个元素，并将两个元素赋值为x和y。当然可以依次类推Array(x,y,z) 匹配数组有3个元素的等等....
  * 3)	Array(0,_*) 匹配数组以0开始
  */
object ArrayMatch {
  def main(args: Array[String]): Unit = {
    for(arr<- Array(Array(0),Array(1,0),Array(10,20),Array(0,1,0),Array(1, 1, 0), Array(1, 1, 0, 1))){
      val result = arr match{
        case Array(0) => "0"
        case Array(x,y) => ArrayBuffer(y,x)
        case Array(0,_*) => "以0 开头的数组"
        case Array(a,b,c,d) =>  println(a + " " + b + " " + c + " " + d)
        case _ => "什么集合都不是"
      }
      println("result = " + result)
    }
    /*
    result = 0
    result = ArrayBuffer(0, 1)
    result = ArrayBuffer(20, 10)
    result = 以0 开头的数组
    result = 什么集合都不是
    1 1 0 1
    result = ()
     */
  }
}
