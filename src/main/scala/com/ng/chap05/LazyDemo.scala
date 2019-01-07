package com.ng.chap05

/**
  * 惰性函数
  */
object LazyDemo {
  def main(args: Array[String]): Unit = {

    // lazy 不能修饰 var 类型的变量
    lazy  val res = myMax(2,3)
    println("------------------")

    println("res = " + res)
    /*
    ------------------
    MyMax 被调用
    f1被调用
    res = 3
     */
  }

  def myMax(n1 :Int,n2 :Int): Int ={
    println("MyMax 被调用")
    f1(2)

    n1 max n2

  }

  def f1(n1:Int):Int ={
    println("f1被调用")
    n1 * 3
  }
}
