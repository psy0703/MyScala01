package com.ng.chap14

/**
  * 使用递归实现翻转字符串
  */
object RecursiveApp02 {
  def main(args: Array[String]): Unit = {
    def reversString(str:String):String={
      if(str.length == 0){
        throw new java.util.NoSuchElementException()
      }

      if (str.length == 1){ //长度为1，直接返回
        str
      } else { //递归，将字符串的头拼接到最后
        reversString(str.tail) + str.head
      }
    }
    val str = reversString("Hello")
    println(str)
  }
}
