package com.ng.chap05

object ThrowsDemo {

  def main(args: Array[String]): Unit = {
    try {
      func1()
    } catch {
      case ex:NumberFormatException =>{
        println(ex.getMessage)
      }
    }
  }

  @throws(classOf[NumberFormatException])
  //等同于NumberFormatException.class
  def func1() ={
    "abc".toInt
  }
}
