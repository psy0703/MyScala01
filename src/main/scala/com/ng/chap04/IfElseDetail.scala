package com.ng.chap04

/**
  * 1. if else 可以直接作为表达式返回值
  * 2. 返回的结果是什么类型，取决于具体逻辑
  * @author cloud9831 
  *         @2019-01-06 15:44 
  */
object IfElseDetail {
  def main(args: Array[String]): Unit = {
    var res = if (5 > 3){
      println("hello")
//      "hello"
    } else{
      123
    }

    println("res = " + res) // res = ()
  }
}
