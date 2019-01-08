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
    //推荐写法(最常见):对方式二的简化(c:Char)类型推断可以省略
    str.foreach( res *= _.toLong) //"_"表示集合中的每一个元素，此时类型为Char

    println("res = " + res)

    //以上代码等价于
    /*def f1(c:Char):Unit = {
      res *= c.toLong
    }
    //str.foreach(f1(_))
    str.foreach(f1)*/

    //方式二：匿名函数
    var res2 = 1L
    str.foreach((c:Char) => {
      res2 *= c.toLong
    })
  }
}
