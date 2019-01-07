package Exercises.d03

import scala.io.StdIn

/**
  * 一个数字如果为正数，则它的signum为1;
  * 如果是负数,则signum为-1;
  * 如果为0,则signum为0.编写一个函数来计算这个值
  */
object Exer01 {
  def main(args: Array[String]): Unit = {
    println("请输入要判断的数字：")
    val num = StdIn.readInt()
    var signum = 0
    if (num > 0){
      signum = 1
    } else if(num < 0 ){
      signum = -1
    } else{
      signum = 0
    }
    println("signum = " + signum)
  }
}
