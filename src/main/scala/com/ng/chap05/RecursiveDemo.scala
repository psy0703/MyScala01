package com.ng.chap05

/**
  * 递归函数案例
  */
object RecursiveDemo {

  def main(args: Array[String]): Unit = {
    test(4)
    println("------------------")
    test2(4)
  }
  def test (n:Int): Unit ={
    if ( n > 2){
      test(n -1 )
    }
    println("n = " + n)
  }

  def test2 ( n : Int): Unit = {
    if ( n > 2){
      test2( n - 1)
    } else{
      println("n = " + n )
    }
  }
}
/*
n = 2
n = 3
n = 4
------------------
n = 2
 */