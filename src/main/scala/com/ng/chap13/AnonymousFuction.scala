package com.ng.chap13

object AnonymousFuction {
  def main(args: Array[String]): Unit = {
    val f1 = (n1:Int,n2:Int) => n1 + n2

    println("f1 的类型是： " + f1)
    //f1 的类型是： <function2> 2指的是形参列表有两个参数
    println(f1(20,30))
  }
}
