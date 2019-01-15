package com.ng.chap13

/**
  * 高阶函数的使用
  * 能够接受函数作为参数的函数，叫做高阶函数 (higher-order function)。
  */
object HigherOrderFunction {
  def main(args: Array[String]): Unit = {

    //说明
    // 1. test就是一个高阶函数
    // 2 test可以接受一个 函数 f: Double => Double
    // 3. 可以接收的函数是传入 Double,返回Double
    def test(f: Double => Double, n1: Double) = {
      f(n1) //调用f函数
    }

    //sum就满足f的格式要求
    def sum(d: Double): Double = {
      d + d
    }

    val res = test(sum, 6.0)
    println("res = " + res) //res = 12.0

    def minusxy(x: Int) =
      (y: Int) => x - y //匿名函数
    //说明：minusxy是一个高阶函数，返回了一个匿名函数
    //2.返回的匿名函数就是(y:Int) => x - y ，这个返回的函数使用到了x
    //3.minusxy(3)(5) 看出两部操作：(1) 先返回一个函数 (y: Int) => 3 – y (2)后执行该返回的匿名函数 3-5 = -2

    val result3 = minusxy(3)(5)
    println("result3 = " + result3)

    def test1(x: Double) = (y: Double) => x * y * y

    val res2 = test1(2.0)(3.0)
    println("res2 = " + res2)
  }
}
