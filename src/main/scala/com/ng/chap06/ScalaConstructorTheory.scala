package com.ng.chap06

object ScalaConstructorTheory {
  def main(args: Array[String]): Unit = {
    val b = new B1("jack") // A1 => B1 => this(name:String)= jack
  }
}

class A1() {
  println("A1")

}

class B1() extends A1() { //
  println("B1")
  //辅助构造器
  def this(name:String) {
    this()
    println("this(name:String)=" + name)
  }
}
