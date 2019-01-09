package com.ng.chap07

/**
  * Scala 的匿名类的使用
  */
object ScalaNoNameClass {
  def main(args: Array[String]): Unit = {
    var Jas = new Monster {
      override var name: String = "Jasmine"

      override def cry(): Unit = {
        println(name + " is crying")
      }
    }
    Jas.cry()

    testNothing()
  }

  def testNothing(): Unit = {
    //空列表Nil(集合)的类型是List[Nothing]，它是List[T]的子类型，T可以是任何类。
    println(Nil.isInstanceOf[List[Nothing]]) //true
    val res = Nil
    println("res = " + res) //List()

    val cols: List[String] = Nil
    val cols2: List[Int] = Nil
    println(cols + " " + cols2) //List() List()
  }

}

abstract class Monster {
  var name: String

  def cry()
}
