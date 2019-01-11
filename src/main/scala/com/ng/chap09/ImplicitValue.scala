package com.ng.chap09

/**
  * 隐式值(也叫隐式变量)，
  * 将某个形参变量标记为implicit，所以编译器会在方法省略隐式参数的情况下去搜索作用域内的隐式值作为缺省参数
  */
object ImplicitValue {
  def main(args: Array[String]): Unit = {
    //str 就是一个隐式值
    implicit var str:String = "Jasmine"
    hello //Jasmine  hello

    //name就是隐式参数
    def hello(implicit name:String): Unit ={
      println(name + "  hello")
    }
  }
}
