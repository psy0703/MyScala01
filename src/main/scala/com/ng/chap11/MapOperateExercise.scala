package com.ng.chap11

/**
  * 请将 val names = List("Alice", "Bob", "Nick") 中的所有单词，
  * 全部转成字母大写，返回到新的List集合中
  * @author cloud9831 
  *         @2019-01-13 22:03 
  */
object MapOperateExercise {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    def f1(s:String):String={
      s.toUpperCase
    }

    val names2 = names.map(f1)
    println(names2)
  }
}
