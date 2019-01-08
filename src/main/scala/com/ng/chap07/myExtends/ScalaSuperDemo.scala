package com.ng.chap07.myExtends

/**
  * Scala的继承案例
  * @author cloud9831 
  *         @2019-01-09 0:28 
  */
object ScalaSuperDemo {
  def main(args: Array[String]): Unit = {
    val emp = new Emp2("jack",22)
    emp.showInfo()
    /*
    Person 初始化 name
    Emp 初始化 age
    name = jack age = 22
     */
  }
}
//要求
//1 var name :String 在父类 Person6初始化
//2.var age: Int 在子类 Emp6 初始化
class Person2 (pName : String){
  var name : String = this.pName
  var age : Int = _
  println("Person 初始化 name ")
}

class Emp2(eName:String,eAge:Int) extends Person2(eName){
  this.age = eAge
  println("Emp 初始化 age")

  def showInfo(): Unit ={
    println("name = " + this.eName + " age = " + this.eAge)
  }
}
