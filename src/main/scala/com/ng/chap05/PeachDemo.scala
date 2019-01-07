package com.ng.chap05
/*
题3：猴子吃桃子问题
有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
以后每天猴子都吃其中的一半，然后再多吃一个。
当到第十天时，想再吃时（还没吃），发现只有1个桃子了。
问题：最初共多少个桃子？
 */
object PeachDemo {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10){

      println("day" +i + ":"  + f1(i))
    }
  }
  def f1(day : Int):Int= {
    if (day >= 1 && day <= 10) {
      if (day == 10) {
        return 1
      } else {

        (f1(day + 1 ) + 1 ) * 2
      }
    } else 0
  }
}
