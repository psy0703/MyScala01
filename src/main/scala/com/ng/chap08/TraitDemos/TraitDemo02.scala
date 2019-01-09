package com.ng.chap08.TraitDemos

/**
  * 特质trait 的再说明
  * 1. 特质可以同时拥有抽象方法和具体方法，一个类可以实现/继承多个特质
  * 2.特质中没有实现的方法就是抽象方法。类通过extends继承特质，通过with可以继承多个特质
  * 3.所有的java接口都可以当做Scala特质使用
  */
object TraitDemo02 {
  def main(args: Array[String]): Unit = {

  }
}
class Logger

class Console extends Logger with Cloneable with Serializable{
  def log(msg:String): Unit ={
    println(msg)
  }
}
