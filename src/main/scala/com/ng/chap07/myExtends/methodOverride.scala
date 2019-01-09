package com.ng.chap07.myExtends

object methodOverride {
  def main(args: Array[String]): Unit = {
    val emp = new Emp7
    emp.printName()
    /*
    Person printName() tom
    Emp's printName
     */
  }
}
class person7{
  var name:String = "tom"
  def printName (){}
  println("Person printName() " + name)
}

class Emp7 extends person7{
  //在scala中，重写方法，需要使用override  显示声明
  override def printName(): Unit = {
    println("Emp's printName " )
    //子类去调用父类的方法，使用super
    super.printName()
  }
}