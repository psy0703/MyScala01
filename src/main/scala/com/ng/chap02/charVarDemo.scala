package com.ng.chap02

object charVarDemo {
  def main(args: Array[String]): Unit = {
    val c:Char = 97

    //这里输出的是97 码值对应的字符
    println("char = " + c) //char = a

//    var c2: Char = 'a' + 1 //错误 Int->Char

    var c2 : Char = ('a' + 1).toChar
    var c3 : Long = 'a' + 1
    println(c2) //b
    println(c3) //98
  }

}
