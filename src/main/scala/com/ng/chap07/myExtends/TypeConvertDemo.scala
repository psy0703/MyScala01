package com.ng.chap07.myExtends

/**
  * scala类型转换案例一
  */
object TypeConvertDemo {
  def main(args: Array[String]): Unit = {
    val worker = new Worker3
    worker.sayOk()
    worker.sayHi()

    val p:Person3 = new Worker3
    //调用
    p.sayHi()

    //能否将父类 转成 子类 (向下转型)
    //如果这样做，需要父类的引用，原来是指向该子类的地址
    p.asInstanceOf[Worker3].sayOk()

    //ClassOf , 可以获取类的全路径
    println(classOf[String])
  }
}
class Person3{
  var name = "smith"
  val age = 80
  def sayHi(): Unit ={
    println(this.name + "hi")
  }
}

class Worker3 extends Person3{
  def sayOk(): Unit ={
    println(this.name + "ok")
  }
}