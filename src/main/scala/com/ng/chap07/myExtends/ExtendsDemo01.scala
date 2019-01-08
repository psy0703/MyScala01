package com.ng.chap07.myExtends

/**
  * 继承案例一
  * @author cloud9831 
  *         @2019-01-09 0:11 
  */
object ExtendsDemo01 {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.study()
    //jack 22 努力学习中
  }
}
class Person{
  var name = "jack" // private name => public name() public name_$eq
  var age = 22

  def showInfo(): Unit ={
    s"信息如下 name = ${this.name} age = ${this.age}"
  }

}
class Student extends Person{
  def study(): Unit ={
    //this.name()  this.age()
    println(this.name + " " + this.age + " 努力学习中")
  }
}
