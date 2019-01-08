package Exercises.d03

/**
  * 一个空的块表达式{}的值是什么？类型是什么？
  */
object Exer02 {
  def main(args: Array[String]): Unit = {
    //代码块是可以当做一表达式来使用的
    //一个空的代码块返回的结果是UNit（如果代码块中有内容，返回类型视内容类型而定
    val res = {}
    println({})
    println("res = " + res)
    //在scala中，可以通过isInstanceof来判断类型
    println(res.isInstanceOf[Unit]) //true
  }
}
