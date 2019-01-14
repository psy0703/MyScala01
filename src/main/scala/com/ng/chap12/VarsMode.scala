package com.ng.chap12

/**
  * 变量声明中的模式
  * match中每一个case都可以单独提取出来
  */
object VarsMode {
  def main(args: Array[String]): Unit = {
    val (x,y) = (1,2)
    val (q,r) = BigInt(10) /% 3 //说明  q = BigInt(10) / 3 r = BigInt(10) % 3
    val arr = Array(1,7,2,9)  //定义数组

    val Array(first,second,_*) = arr //将arr的前两个元素，赋给first和second

    println(first,second) //(1,7)

    println("--------------------------")
    val (n1,n2,name,n3) = (10, 20, "jack", sum(10, 50))

    println("num1=" + n1)
    println("num2=" + n2)
    println("name=" + name)
    println("num3=" + n3)

  }
  def sum(n1:Int,n2:Int): Int = {
    n1 + n2
  }


}
