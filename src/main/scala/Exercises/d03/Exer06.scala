package Exercises.d03

/**
  * 编写一个for循环,计算字符串中所有字母的Unicode代码（toLong方法）的乘积。
  * 举例来说，"Hello"中所有字符串的乘积为9415087488L
  * 请用StringOps的foreach方式解决
  */
object Exer06 {
  def main(args: Array[String]): Unit = {
    val str = "Hello"
    var res : BigInt = 1
    str.foreach( res *= _.toLong) //"_"表示集合中的每一个元素，此时类型为Char

    println("res = " + res)
  }
}
