package com.ng.chap12

/**
  * 2) 在进行类型匹配时，编译器会预先检测是否有可能的匹配，如果没有则报错.
  */
object TypeMatchDetail {
  def main(args: Array[String]): Unit = {

        val obj = 10
        val result = obj match {
          case a : Int => a
//          case b : Map[String, Int] => "Map集合" //这里会报错
          case _ => "啥也不是"
        }

  }
}
