package com.ng.chap04

/**
  * @author cloud9831 
  *         @2019-01-06 16:29 
  */
object ForDemo01 {
  def main(args: Array[String]): Unit = {
    //前后闭合
    for (i <- 1 to 10){
      println("hello " + i)
    }

    //for的<- 后可以直接是集合，类似java for循环增强
    var arr = Array("a","b", "c")
    for(item <- arr){
      println("item = " + item)
    }

    //左闭右开
    for (j <- 1 until 11){
      println("j = " + j )
    }

  }
}
