package Exercises.d03

/**
  *编写一个函数product(s:String)，
  * 计算字符串中所有字母的Unicode代码（toLong方法）的乘积
  */
object Exer07 {
  def main(args: Array[String]): Unit = {
    println(product("Hello"))
  }

  def product(s:String) = {
    var res:Long = 1
    for ( i <- 0 to (s.length - 1)){
      println(s.charAt(i) + ":" + s.charAt(i).toLong)
      res *= s.charAt(i).toLong
    }
    res
  }
}
