package com.ng.chap12

/**
  * case语句的中置(缀)表达式
  * 什么是中置表达式？1 + 2，这就是一个中置表达式。
  * 如果unapply方法产出一个元组，
  * 可以在case语句中使用中置表示法。比如可以匹配一个List序列
  */
object MatchMid {
  def main(args: Array[String]): Unit = {
    List(1,3,5,9) match {
      //1.两个元素间::叫中置表达式,至少first，second两个匹配才行.
      //2.first 匹配第一个 second 匹配第二个, rest 匹配剩余部分(5,9)
      case first::second::rest => println(first + " " + second + " " + rest + rest.length)
      case _ => println("matched nothing .")
      //1 3 List(5, 9)2
    }
  }
}
