package com.ng.chap17

/**
  * 1) 编写一个Message类
  * 2) 可以构建Int类型的Message,String类型的Message.
  * 3) 要求使用泛型来完成设计(说明：不能使用Any)
  */
object GenericDemo {
  def main(args: Array[String]): Unit = {
    val intMessage = new IntMessage(11)
    val stringMessage = new StringMessage("Hello")

    println(intMessage.get)
    println(stringMessage.get)
  }
}
//抽象类,指定泛型
abstract class Message[T](s: T) {
  def get: T = s
}
//可以构建Int类型的Message,
class IntMessage[Int](mes:Int) extends Message(mes)
//String类型的Message.
class StringMessage[String](mes:String) extends Message(mes)