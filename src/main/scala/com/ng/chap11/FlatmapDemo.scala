package com.ng.chap11

/**
  * @author cloud9831 
  *         @2019-01-13 22:06 
  */
object FlatmapDemo {
  def main(args: Array[String]): Unit = {
    val names = List("Alice","Bob","Nick")

    def upper(str:String):String={
      str.toUpperCase()
    }

    println(names.flatMap(upper))
    //List(A, L, I, C, E, B, O, B, N, I, C, K)
  }
}
