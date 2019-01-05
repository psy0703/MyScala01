package com.ng.chap02

object varDemo4 {
  def main(args:Array[String]):Unit = {
    var num1 = 1
    var num2 = 1L
    var num3: Long = 1

    var num4 = 999999999999999l
    println(Int.MaxValue + "," + Int.MinValue)
    //2147483647,-2147483648
  }
}
