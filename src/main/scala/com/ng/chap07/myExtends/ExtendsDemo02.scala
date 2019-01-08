package com.ng.chap07.myExtends

/**
  * @author cloud9831 
  *         @2019-01-09 0:15 
  */
object ExtendsDemo02 {
  def main(args: Array[String]): Unit = {
    val sub = new Sub
    println("--------------------------")
    sub.sayOk()
    /*
    范围： 2040
    base 100
    base 200
     */
  }
}
class Base{ //基类
  var n1:Int = 1
  protected var n2:Int = 2 //public public
  private var n3 : Int = 3 //private private

  //方法默认是public
  def test1(): Unit ={
    println("base 100")
  }

  //protected
  protected def test2(): Unit ={
    println("base 200")
  }

  //private
  private def test3(): Unit ={
    println("base 300")
  }
}


class Sub extends Base{
  def sayOk(): Unit ={
    this.n1 = 20 //this.n1()
    this.n2 = 40 //this.n2()
//    this.n3
    println("范围： " + this.n1 + this.n2)

    this.test1()
    this.test2()
//    this.test3()
  }
}