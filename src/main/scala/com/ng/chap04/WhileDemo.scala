package com.ng.chap04

/**
  * @author cloud9831 
  *         @2019-01-06 18:19 
  */
object WhileDemo {
  def main(args: Array[String]): Unit = {
    //输出10句"你好"
    var n = 0
    while (n < 10) {
      println("你好  " + n)
      n += 1
    }
  }
}

/*
循环条件是返回一个布尔值的表达式
while循环是先判断再执行语句
与If语句不同，While语句本身没有值，即整个While语句的结果是Unit类型的()
因为while中没有返回值,所以当要用该语句来计算并返回结果时,就不可避免的使用变量 ，而变量需要声明在while循环的外部，那么就等同于循环的内部对外部的变量造成了影响，所以不推荐使用，而是推荐使用for循环。
 */