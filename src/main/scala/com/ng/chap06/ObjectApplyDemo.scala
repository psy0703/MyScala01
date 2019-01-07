package com.ng.chap06
/*
小狗案例

编写一个Dog类，包含name(String)、age(Int)、weight(Double)属性
类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。
在另一个TestDog类中的main方法中，创建Dog对象，并访问say方法和所有属性，将调用结果打印输出。
 */
object ObjectApplyDemo {
  def main(args: Array[String]): Unit = {

  }
}
class Dog2 {
  var name:String  = _
  var age :Int = _
  var weight : Double = _
  def say(): String = {
    s"信息如下: name=${this.name} age = ${this.age} weight=${this.weight}"
  }
}

object TestDog {
  def main(args: Array[String]): Unit = {
    val dog = new Dog2
    dog.name = "小花"
    dog.age = 10
    dog.weight = 20.3
    println(dog.say())
  }
}