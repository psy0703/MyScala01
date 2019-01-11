package com.ng.chap09

/**
  * 隐式的转换时机
  * 1) 当方法中的参数的类型与目标类型不一致时
  * 2) 当对象调用所在类中不存在的方法或成员时，编译器会自动将对象进行隐式转换（根据类型）
  */
object ImplicitChance {


  def main(args: Array[String]): Unit = {

    f1(10)
    f1(11.1)  //

    //创建狗
    val dog = new Dog("小花狗")
    f3(dog) //
  }

  def f1(n1:Int): Unit = {
    n1 * 2
  }

  def f3(tiger:Tiger): Unit = {
    println(tiger.name) //
  }
  implicit def f2(d:Double): Int = {
    d.toInt
  }

  implicit def f4(dog:Dog): Tiger = {
    new Tiger(dog.name)
  }
}

class Dog (var name:String)
class Tiger(var name:String)