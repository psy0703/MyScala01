package Exercises.d05

import scala.io.StdIn

/**
  * 3、编写一个 Scala 应用程序,使用 App 特质,以反序打印命令行参数,用空格隔开。
  * 举例来说,scala Reverse Hello World 应该打印 World Hello
  */
object Exer03 extends App {
  println("请输入要输出的句子，单词之间以空格隔开：")
  private val str: String = StdIn.readLine()
  Reverse(str)

  def Reverse(str:String) :Unit={
    val strings:Array[String] = str.split(" ")
    val reverse = strings.reverse
    for(i <- reverse){
      myPrint(i)
    }
  }

  def myPrint(s:String): Unit ={
    print(s + " ")
  }
}
