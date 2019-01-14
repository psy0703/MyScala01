package com.ng.chap11

/**
  * 扫描，即对某个集合的所有元素做fold操作，
  * 但是会把产生的所有中间结果放置于一个集合中保存
  */
object ScanDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    def minus (num1:Int,num2:Int):Int={
      num1 - num2
    }

    println(list.scanLeft(5)(minus))
    //List(5, 4, 2, -1, -5, -10)
    println("------------------------")

    println(list.scanRight(5)(minus))
    //List(-2, 3, -1, 4, 0, 5)

    //求出 1 – 10 的斐波那契

  }
}
