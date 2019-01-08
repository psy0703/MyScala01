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
    //如果s 的长度为1 ，直接返回对应的码值
    if (s.length == 1){
      s.charAt(0).toLong //s(0).toLong

    } else{ //如果s 的长度大于1 等于第一个字符对应码值乘以后面所有字符的码值
      // s.drop(1)表示的含义是去掉了第一个字符的其他部分
      s.charAt(0).toLong * product(s.drop(1))
    }
  }

}
