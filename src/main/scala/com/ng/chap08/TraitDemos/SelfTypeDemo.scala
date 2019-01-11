package com.ng.chap08.TraitDemos

/**
  * 自身类型(self-type)：主要是为了解决特质的循环依赖问题，
  * 同时可以确保特质在不扩展某个类的情况下，依然可以做到限制混入该特质的类的类型
  */
object SelfTypeDemo {
  def main(args: Array[String]): Unit = {
    println("hello")
  }
}
//Logger 就具体self -type
trait Logger2{
  this:Exception => {
    //自身类型的体现
    def log(): Unit ={
      // 既然我就是Exception, 那么就可以调用其中的方法
      println(getMessage)
    }
  }
}

//class console extends Logger2 //错误，因为Console不是 Logger 的自身类型约束 Exception

class console extends Exception with Logger2  // 正确，因为Console是Exception的子类