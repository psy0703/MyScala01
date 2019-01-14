package com.ng.chap12

/**
  * 12.3	模式中的变量
  * 如果在case关键字后跟变量名，那么match前表达式的值会赋给那个变量
  */
object ModeVar {
  def main(args: Array[String]): Unit = {
    val ch ="v"

    //说明
    //1.在Scala中，可以将match当作一个表达式使用
    //2.这个特性非常有用
    val res =ch match {
      case "+" => println("ok!!")

        //1.case myStr 叫模式的变量
        //2. myStr = ch
      case myStr => println("ok~ " + myStr)
      case _ => println("error")
    }
    println("res = " + res)
  }
}
