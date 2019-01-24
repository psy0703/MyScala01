package com.ng.chap14

/**
  * 使用递归实现对传统的斐波那契递归算法优化
  */
object FBNbyRecursive {
  def main(args: Array[String]): Unit = {
    def fbn(n:Int,acc1:Int,acc2:Int):Int={
      if (n == 1){ // 当 n==1 的时候表示是第 n 次计算, acc2就是我们需要的值了
        acc2
      } else {
        fbn(n - 1,acc2,acc1 + acc2)
      }
    }

    val i = fbn(5,0,1)
    println(i)
  }
}
