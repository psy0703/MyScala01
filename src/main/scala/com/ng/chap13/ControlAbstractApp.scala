package com.ng.chap13

/**
  * 控制抽象的最佳实践
  * 通过控制抽象，实现了while循环的效果. =>do while
  */
object ControlAbstractApp {
  def main(args: Array[String]): Unit = {
//    var n = -10
//    while(n >0){ //while循环, 可以通过控制抽象 实现
//      println("n = " + n)
//      n -= 1
//    }
//println("-------------------------------")
//    var n2 = -10
//    myWhile(n2 > 0){
//      println("n2 = " + n2)
//      n2 -= 1
//    }
//
//    def myWhile(condition: =>Boolean)(block: => Unit): Unit ={
//      //类似while循环，递归
//      if (condition) {
//        block
//        myWhile(condition)(block)
//      }
//    }

    //自己实现do-while
    var n3 = -5
    /*do {
      println("n3 = " + n3)
      n3 -= 1
    } while(n3 > 0)*/

    def myDoWhile(condition: => Boolean)(block: => Unit): Unit ={
      block
      if(condition){
        myDoWhile(condition)(block)
      }
    }

    myDoWhile(n3 > 0){
      println("n3 =" + n3)
      n3 -= 1
    }
  }
}
