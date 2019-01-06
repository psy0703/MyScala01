package com.ng.chap04

/**
  * Do-while 循环
  *
  * @author cloud9831 
  *         @2019-01-06 18:21 
  */
object DoWhileDemo {
  def main(args: Array[String]): Unit = {
    var n = 0
    do {
      println("hello + " + n)
      n += 1
    }while(n <=10)
  }
}
/*
1.循环条件是返回一个布尔值的表达式
2.do..while循环是先执行，再判断
3.和while 一样，因为do…while中没有返回值,所以当要用该语句来计算并返回结果时,
就不可避免的使用变量 ，而变量需要声明在do...while循环的外部，
那么就等同于循环的内部对外部的变量造成了影响，所以不推荐使用，而是推荐使用for循环

 */