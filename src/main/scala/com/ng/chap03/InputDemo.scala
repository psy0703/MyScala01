package com.ng.chap03

import scala.io.StdIn

object InputDemo {
  def main(args: Array[String]): Unit = {

    //从控制台接收信息
    //在scala中通过StdIn 的object 来获取， 因此可以直接使用StdIn的方法，因为他是静态形式
    println("name:")
    val name = StdIn.readLine()

    println("age: ")
    val age = StdIn.readShort()

    println("salary: ")
    val salary = StdIn.readDouble()

    println("info: ")
    printf("name= %s, age = %d , salary = %f\n",name,age,salary)

    //说明一下object 方法可以直接调用原因
    //在object定义的方法和变量都是static性质，可以直接调用
    Cat.cry()
    println(Cat.name)
  }
}
object Cat {
  val name = "mimi"
  def cry():Unit={
    println("mimimi~~~")
  }
}
