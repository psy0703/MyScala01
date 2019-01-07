package Exercises.d03

/**
  * 编写一个函数product(s:String)，
  * 计算字符串中所有字母的Unicode代码（toLong方法）的乘积
  * 改成递归函数
  */
object Exer08 {
  def main(args: Array[String]): Unit = {
    println(product("Hello"))
  }

  def product(s:String):Long = {
    if (s.length == 1){
      s.charAt(0).toLong
    } else{
      s.take(1).charAt(0).toLong * product(s.drop(1))
    }
  }

}
