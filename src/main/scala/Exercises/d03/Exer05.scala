package Exercises.d03

/**
  * 编写一个for循环,计算字符串中所有字母的Unicode代码（toLong方法）的乘积。
  * 举例来说，"Hello"中所有字符串的乘积为9415087488L
  */
object Exer05 {
  def main(args: Array[String]): Unit = {
    val str = "Hello"
    var res:BigInt = 1L
    for ( i <- 0 to (str.length - 1)){
      println(str.charAt(i) + ":" + str.charAt(i).toLong)
      res *= str.charAt(i).toLong
    }
    println("res = " + res)
  }
}
