package com.ng.chap07.myExtends

/**
  * Scala属性重写
  */
object ScalaPropertyOverride {
  def main(args: Array[String]): Unit = {
    val aa:AAA = new BBB()
    val bb:BBB = new BBB()

    println(aa.age) //20
    println(bb.age) //20

    println(bb.asInstanceOf[AAA].age) //20
  }
}
class AAA{
  val age : Int = 10  //private age => public age()
}

class BBB extends AAA{
  override val age : Int = 20 // private => public age()
}