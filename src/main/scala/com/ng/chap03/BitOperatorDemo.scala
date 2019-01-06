package com.ng.chap03

object BitOperatorDemo {
  def main(args: Array[String]): Unit = {
    //二进制规则
    /*
    对于有符号的而言:
    1) 二进制的最高位是符号位: 0表示正数,1表示负数
    2) 正数的原码，反码，补码都一样
    3) 负数的反码=它的原码符号位不变，其它位取反(0->1,1->0)
    4) 负数的补码=它的反码+1
    5) 0的反码，补码都是0
    6) scala没有无符号数，换言之，scala中的数都是有符号的
    7) 在计算机运算的时候，都是以补码的方式来运算的.
     */

    println(1 | 2)  //3

    println("res= " + (-3 & -1))  //-3

    println(-1 | -2) //-1
  }
}
